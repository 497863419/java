package Test.DS.LinkedList;

/**
 * @Name：链表接口
 * @Author：ZYJ
 * @Date：2019-07-23-15:21
 * @Description:
 */
public interface ILinked {
    // 头插法
    void addFirst(int data);

    // 尾插法
    void addLast(int data);

    // 任意位置插入,第一个数据节点为0号下标
    void addIndex(int index, int data);

    // 查找是否包含关键字key是否在单链表当中
    boolean contains(Object data);

    // 删除第一次出现关键字为key的节点

    Object remove(int index);

    //删除所有值为key的节点
    void removeAllKey(Object key);

    //获取指定索引的节点
    Object get(int index);

    //将指定索引的数据设置为data
    Object set(int index, Object newData);

    //得到单链表的长度
    int getLength();

    void display();

}
