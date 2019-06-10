# Lock 体系 

## 1.  产生原因与定义

### 1.1 LOCK锁（JDK1.5提供 基于java语言层面 的“锁”）

 产生背景：`sychroniezd` 死锁，是一种阻塞式获取锁：获取不到线程一直阻塞下去，

破坏**不可抢占（不公平） **问题：

1，synchronized 不响应 `interrupt`中断

2，支持超时

3，非阻塞式获取锁 线程若获取不到锁，线程直接退出。

**可重入锁**：持有锁的线程可以再次对锁的计数器+1；`synchroniezd` 可以实现可重入。

```java
public synchronized void tastA(){
    testB();
}
public synchronized void testB(){
    
}
```

Lock锁实现提供了比使用 `synchronized` 方法和语句可获得的更广泛的锁定操作。

> **出现原因**： `synchronized`  方法或语句的使用提供了对与每个对象相关的隐式监视器锁的访问，但却强制所有锁获取和释放均要出现在一个块结构中：当获取了多个锁时，它们必须以相反的顺序释放，且必须在与所有锁被获取时相同的词法范围内释放所有锁。 (**出现不公平锁问题，synchronized无法实现公平锁**)
>
> 虽然 `synchronized`  方法和语句的范围机制使得使用监视器锁编程方便了很多，而且还帮助避免了很多涉及到锁的常见编程错误，但有时也需要以更为灵活的方式使用锁。例如，某些遍历并发访问的数据结果的算法要求使用  "hand-over-hand" 或 "chain locking"：获取节点 A 的锁，然后再获取节点 B 的锁，然后释放 A 并获取 C，然后释放 B  并获取 D，依此类推。**`Lock` 接口的实现允许锁在不同的作用范围内获取和释放，并允许以任何顺序获取和释放多个锁，从而支持使用这种技术。**   
>
> 随着灵活性的增加，也带来了更多的责任。不使用块结构锁就失去了使用 `synchronized` 方法和语句时会出现的锁自动释放功能。

### 1.2 定义

 **Lock锁是一个接口**

```java
java.util.concurrent.locks.Lock;
```

实现Lock接口类（lock的子类）

```java
java.util.concurrent.locks.ReentrantLock;//可重入锁。
```



## 2 . 使用格式

```java
try{
    //加锁
    lock.lock();
}finally{
    lock.unlock();
}
```

使用步骤：

1）.在成员位置创建一个`ReentrantLock`对象

2）.在可能会出现安全问题的代码前调用Lock接口中的方法 `lock（）`获取锁；

3）.在可能会出现安全问题的代码后调用Lock接口中的方法`unlock（）`释放锁；

优化：将释放锁 `unlock（）`的代码写入finally代码块之中，这样无论是否出现异常，都会释放锁，提高程序的效率

实例：

```java
package ThreadClass.LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name：   Lock锁
 * @Author：ZYJ
 * @Date：2019-06-03-20:03
 * @Description:  使用lock锁实现锁，解决线程安全问题
 */
public class TestDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class MyThread implements Runnable {
    private int tick = 100;
    //1.在成员位置创建一个ReentrantLock对象；
    private Lock ticketLock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //2.在可能出现安全问题的代码前调用lock()
            ticketLock.lock();
            try {
                if (this.tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "还有" + this.tick-- + "张票");
                }
            }finally {
                //3.在可能出现安全问题的代码后调用unlock()
                //将unlock()语句放在finally代码块中 无论是否出现安全问题，都会释放锁。
                ticketLock.unlock();
            }

        }
    }
}
```



**内存同步**

> 所有 `Lock` 实现都*必须* 实施与内置监视器锁提供的相同内存同步语义，如 [The Java Language Specification,  Third Edition (17.4 Memory Model)](http://java.sun.com/docs/books/jls/) 中所描述的:  
>
> - 成功的 `lock` 操作与成功的 *Lock* 操作具有同样的内存同步效应。  
> - 成功的 `unlock` 操作与成功的 *Unlock* 操作具有同样的内存同步效应。  

## 3. 方法

### 3.1 重要方法

1.响应中断 

```java
void lockInterruptibly();
```

程序中有多个return语句会执行finally代码块，先执行finally的代码

2.支持超时

线程A阻塞，线程B

```java
boolean tryLock(long time,TimeUnit unit)
```

3.非阻塞式获取锁

```java
boolean tryLock();//非阻塞式响应中断立即返回，获取锁返回true反之为false。
```

### 3.2 其他方法

```java
void lock();//获取锁
Condition newCondition();//获取与lock绑定的等待通知组件，当前线程必须先获得了锁才能等待，等待会释放锁，再次获取到锁才能从等待中返回
```



## 4 .synchronized与Lock的关系

### 4.1 **相同点：**

synchronized与Lock都是对象锁，都支持可重入锁

可重入锁：表示能够对共享资源重复加锁，即当前线程获取该锁再次获取不会阻塞。

### 4.2 不同：

> 1.Lock可以实现`synchroniezd` 不具备的特征，如 **响应中断，支持超时，非阻塞的获取锁，公平锁、共享锁**（读写锁，`ReentrantReadWriteLock`实现）
>
> 2.Lock体系的Condition队列可以有多个（区分与synchronized只有一个等待队列），可以进一步提高效率，减少线程阻塞与唤醒带来的开销（唤醒了不该唤醒的线程）
>
> 3.synchronized同步块执行完成或者遇到异常时，锁会自动释放，而Lock必须调用unlock（）方法释放锁，因此在finally释放锁。
>
> 获取一个lock锁的condition队列:
>

`lock.newCondition()`:产生一个新的Condition队列



#### 4.2.1 公平锁：

所谓公平性，是针对获取锁而言的，如果一个锁是公平的，那么锁的获取顺序就应该符合请求上的绝对时间顺序。公平锁每次都是从同步队列的第一个节点获取到锁，保证请求资源时间上的绝对顺序。而非公平性锁则不一定，有可能共释放锁的线程就会再次获取到锁，则有可能导致其他线程永远无法获取到锁，造成“饥饿现象”。

**解决公平锁**（`ReentrantReadWriteLock`）

`ReentrantReadWriteLock`的构造方法无参时是构造非公平锁。

```java
public ReentrantLock(){
    sync= new NonfairSync();//非公平锁
}
```

```java
public ReentrantLock(boolean fair){
    sync = fair ? new FairSyc():new NonfairSunc();//公平锁。
}
```



#### 4.2.2 读写锁（共享锁）：读写锁是共享锁的一种实现，

读锁共享：多个线程可以同时拿到读锁进行访问，当写线程拿到写锁开始工作，所有读线程全部阻塞。

写锁独占：任意一个时刻，只有一个线程可以拿到写锁。

读读-不互斥：

读写、写写 互斥。

#### 4.2.3 独占锁

**synchronized是独占锁，任意时刻只有一个线程可以拥有锁。**

**共享锁：在同一时刻，可以有多个线程拥有锁。**
