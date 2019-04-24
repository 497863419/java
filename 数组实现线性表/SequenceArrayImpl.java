package bittech.DS;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Name：基于数组的线性表
 * @Author：ZYJ
 * @Date：2019-04-24-15:34
 * @Description:基于数组实现的线性表 ，可扩容
 */
public class SequenceArrayImpl implements Sequence {
    private static final int DEFAULT_CAPACITY = 10;//默认容量
    private int size;//存放元素个数
    private Object[] elementDate;//存放元素的数组
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8; //规定最大数量

    /**
     * 构造方法
     * 无参构造
     * 将Object 对象默认初始化为数组
     */
    public SequenceArrayImpl() {
        this.elementDate = new Object[DEFAULT_CAPACITY];
    }

    public SequenceArrayImpl(int capacity) {
        if (capacity > 0) {
            this.elementDate = new Object[capacity];
        }
    }

    /**
     * 向线性表中添加元素
     *
     * @param data 要存储的元素
     */
    @Override
    public void add(Object data) {//增加元素
        //首先 判断添加元素是否导致数组越界
        //若越界先进性扩容 而后储存元素
        ensureCapacityInternal(size + 1);
        elementDate[size++] = data;
    }

    /**
     * 删除指定索引元素
     *
     * @param index 要删除元素的下标
     * @return
     */
    @Override
    public Object remove(int index) {
        rangCheck(index);
        //保存原数据
        Object oldData = elementDate[index];
        int moveSize = size - index - 1;
        if (moveSize > 0) {
            System.arraycopy(elementDate, index + 1, elementDate, index, moveSize);
        }
        //更新size  并将最后一个元素置空
        elementDate[--size] = null;//若使用size-- 会法生数组越界异常 先减后用
        return oldData;
    }

    /**
     * 查找指定元素
     *
     * @param data 要查找的元素内容
     * @return
     */
    @Override
    public boolean contains(Object data) {
        if (data == null) {
            for (int i = 0; i < size; i++) {
                if (elementDate[i] == null) {
                    return true;
                }
            }

        } else {
            for (int i = 0; i < size; i++) {
                if (data.equals(elementDate[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 得到指定索引值
     *
     * @param index 要找的元素索引
     * @return
     */
    @Override
    public Object get(int index) {
        rangCheck(index);
        return elementDate[index];
    }

    /**
     * 修改索引的值
     *
     * @param index   要修改的元素下标
     * @param newData 要修改的内容
     * @return
     */
    @Override
    public Object set(int index, Object newData) {
        //首先检查索引是否合法
        rangCheck(index);
        //将原数据保存
        Object oldData = elementDate[index];
        //设置新的数据
        elementDate[index] = newData;
        return oldData;

    }

    /**
     * 返回当前元素个数
     *
     * @return
     */
    @Override
    public int Size() {
        return this.size;
    }

    /**
     * 清空数组
     */
    @Override
    public void clear() {//清空数组
        for (int i = 0; i < size; i++) {
            elementDate[i] = null;
        }
        this.size = 0;

    }

    /**
     * 将传输数据转为数组
     *
     * @return
     */
    @Override
    public Object[] toArray() {//转数组
        return this.elementDate;
    }

    /**
     * 判断容量合法
     *
     * @param cap 添加元素后size
     */
    private void ensureCapacityInternal(int cap) {
        //越界
        if (cap - elementDate.length > 0) {
            grow(cap); //扩容

        }
    }

    /**
     * 扩容方法
     *
     * @param cap 当前元素个数
     */
    private void grow(int cap) {
        int oldCap = elementDate.length;
        int newCap = oldCap << 1;//左移一位 == *2
        if (cap - newCap > 0) {//cap>newCap 添加后size>扩容容量
            newCap = cap;//将扩容后容量作为新的容量
        }
        if (newCap - MAX_ARRAY_SIZE > 0) {//扩容后容量大于最大容量
            throw new IndexOutOfBoundsException("线性表超出最大值");
        }
        //数组扩容
        elementDate = Arrays.copyOf(elementDate, newCap);
    }

    /**
     * 判断下标是否合法
     *
     * @param index 指定索引
     * @return 返回合法性
     */
    public void rangCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标不存在");
        }
    }

}
