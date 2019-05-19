# IO（jdk1.0  BIO  阻塞式IO）

JDK 1.4 NIO  非阻塞式

JDK 1，7 AIO

IO的核心组成 就是五个类：（File、OutputStream、InputStream、Reader、Writer）和一个接口 （Serializable）;

 ## 1. File  文件操作类

File 是唯一一个与文件本身相关（不涉及文件内容）的基本操作（创建、删除、取得文件信息）类。

File即可描述文件也可描述文件夹；

### 1.1 File类的使用

1.实例化对象（构造方法）

根据文件路径创建File对象，文件可以不存在

```java
public File(String pathname);
public File(String parent,String child);//设置父路径和子路径
```

2.创建一个新文件

```java
public boolean createNewFile() throws IOException
```

IOException : 受查异常，强制用户处理

3，判断文件是否存在

```java
public boolean exists();
```

4.删除文件

```java
public boolean delete();
```

5.分隔符

File.separator  支持不同系统下的文件分隔符

由不同操作系统下的JVM来决定正确的分隔符

###1.2.目录问题

File 类中关于目录的操作有以下方法

1. 取得父路径或父对象：

   ```java
   public string getParent();//取得父路径
   ```

   ```java
   public File getParentFile();//取得父对象
   ```

2. 创建目录(一次创建多级目录)；父母目录文件调用

   ```java
   public boolean mkdirs();
   ```

   代码示例

   ```java
   package JAVASE.IOtext;
   
   import java.io.File;
   import java.io.IOException;
   
   public class Test2 {
       public static void main(String[] args)throws IOException {
           File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\test.java");
           //进行父路径判断
           if(!file.getParentFile().exists()){//若父路径不存在
               //创建父路径
               file.getParentFile().mkdirs();
           }
           if(file.exists()){//若文件存在
               file.delete();
           }else {
               file.createNewFile();
           }
       }
   }
   ```

   

### 1.3 文件信息

1.判断路径是否是文件

```java
public boolean ifFile()
```

2.判断路径是否是目录

```java
public boolean isdirectory()
```

3.取得文件大小

```java
public long length()
```

4.最后一次修改日期

```
public long lastModified();
```

代码示例

```java
package JAVASE.IOtext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws IOException {

   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//创建格式
   File file = new File("C:\\Users\\ZYJ\\Desktop\\QQ截图20190403191453.png");//实例化File对象
   Date date1= new Date(file.lastModified());//实例化日期类对象
   if(file.exists()&&file.isFile()){//保证文件存在并且是个文件
            System.out.println("文件大小"+file.length());
            System.out.println("最后修改时间为："+simpleDateFormat.format(date1));
        }
    }
}
```

5.列出一个目录的全部组成

```java
public File[] listFiles()//列出文件夹中的所有文件，只要是文件夹就遍历，返回值为一个File类的数组
```

```java
public class IoTest{
    public static void main(String[] args){
        File file = new File("C:\Users\ZYJ\Desktop\JavaSE全套课件");
        if(file.exists&&file.isDirectory()){
           File[] dates = file.listFiles();
            for(File file2 :dates){
               System out.println(file2);
            }
        }
    }
}
```

### 1.4  递归打印当前目录下的所有层级的文件信息

```java
package JAVASE.IOtext;

import java.io.File;

/**
 * @Name：  递归打印当前目录下的所有层级的文件信息
 * @Author：ZYJ
 * @Date：2019-05-09-08:43
 * @Description:  利用递归实现
 */
public class Test5 {
    public static void main(String[] args) {
        //实例化对象
        File file =  new File("C:\\Users\\ZYJ\\Desktop");
        long start =System.currentTimeMillis();
        listAllFiles(file);
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start));
    }
    public static void listAllFiles(File file){
        //如果当前文件是目录
       if(file.isDirectory()){
           //将文件转化为文件类型的数组
           File[] dates = file.listFiles();
           //遍历数组
           if(dates!=null) {
               for (File file1 : dates) {
                   //调用自己  
                   listAllFiles(file1);
               }
           }
       }else{
           //若不是目录就打印
           System.out.println(file);
       }
    }
}

```

出现问题  线程阻塞问题

所有的代码都是在mian线程下完成的，如果lisAllFiles（）方法没有完成，mian后续的代码将无法执行，这种耗时的操作让主线程出现了阻塞，而导致后续代码无法正常执行完毕。解决办法：产生新的线程；

