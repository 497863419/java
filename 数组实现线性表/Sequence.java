package bittech.DS;

/**
 * @Name：线性表规范
 * @Author：ZYJ
 * @Date：2019-04-24-15:15
 * @Description:自己实现一个线性表
 * 1.可以扩容
 * 2.有常用的增删查改功能
 */
public interface Sequence {
    /**
     * 向线性表中添加元素
     * @param data  要存储的元素
     */
    void add(Object data);

    /**
     *删除线性表的内容
     * @param index 要删除元素的下标
     * @return
     */
    Object remove(int index);

    /**
     * 判断线性表是否包含指定元素方法
     * @param data 要查找的元素内容
     * @return 是否找到指定元素
     */
    boolean contains(Object data);

    /**
     * 在线性表中查找元素
     * @param index 要找的元素索引
     * @return 指定元素
     */
    Object get(int index);

    /**
     * 修改线性表
     * @param index 要修改的元素下标
     * @param newData 要修改的内容
     * @return
     */
    Object set(int index,Object newData);

    /**
     * 返回当前元素个数
     * @return
     */
    int Size();

    /**
     * 清空线性表
     */
    void clear();

    /**
     *将线性表转化为数组
     * @return
     */
    Object[] toArray();

}
