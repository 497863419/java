package Test.DS.LinkedList;

/**
 * @Name：实现单链表
 * @Author：ZYJ
 * @Date：2019-07-24-08:56
 * @Description:
 */
public class LinkedListImpl implements ILinked {
    private Node dummyHead;
    private int size;
    private class Node{
        private Object date;
        private Node next;

        public Node(Object date) {
            this.date = date;
        }

        public Node(Object date, Node next) {
            this.date = date;
            this.next = next;
        }
    }

    public LinkedListImpl() {
        dummyHead=new Node(null,null);
    }

    /**
     * 头插
     * @param data
     */
    @Override
    public void addFirst(int data) {
       addIndex(0,data);
    }

    /**
     * 尾插
     * @param data
     */
    @Override
    public void addLast(int data) {
       addIndex(size,data);
    }

    /**
     * 指定位置插入
     * @param index
     * @param data
     */
    @Override
    public void addIndex(int index, int data) {
        rangCheck(index);
        Node prev = dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        Node newNode = new Node(data,prev.next);
        prev.next=newNode;
        size++;
    }

    /**
     * 判断是否存在指定值
     * @param data
     * @return
     */
    @Override
    public boolean contains(Object data) {
        if(data==null){
            for(Node prev =dummyHead.next;prev!=null;prev=prev.next){
                if(prev.date==null){
                    return true;
                }
            }
        }else {
            for(Node prev =dummyHead.next;prev!=null;prev=prev.next){
                if (prev.date.equals(data)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        rangCheck(index);
        Node prev= dummyHead;
        Object oldData=node(index).date;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
        return oldData;
    }

    /**
     * 删除所有值为指定值的节点
     * @param key
     */
    @Override
    public void removeAllKey(Object key) {
        Node prev =dummyHead;
        while (prev.next!=null){
            if (prev.next.date==key){
                prev.next=prev.next.next;
                size--;
            }else {
                prev=prev.next;
            }
        }
    }

    /**
     * 获取指定索引的节点
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return node(index).date;
    }

    /**
     * 将指定索引的值设置为
     * @param index
     * @param newData
     * @return
     */
    @Override
    public Object set(int index, Object newData) {
        rangCheck(index);
        Object oldData =node(index).date;
        node(index).date=newData;
        return oldData;
    }

    @Override
    public int getLength() {
        return size;
    }

    @Override
    public void display() {
     /* for(Node prev =dummyHead.next;prev!=null;prev=prev.next){
          System.out.print(prev.date);
      }
        System.out.println();*/
     for(int i=0;i<size;i++){
         System.out.print(node(i).date);
     }
        System.out.println();

    }

    /**
     * 取得当前节点
     * @param index
     * @return
     */
    private Node node(int index){
        rangCheck(index);
        Node prev = dummyHead.next;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        return prev;
    }

    /**
     * 检查下标
     * @param index
     */
    private void rangCheck(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }
}
