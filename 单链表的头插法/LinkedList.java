/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-04-25-16:37
 * @Description:
 */
public class LinkedList {
    private  Node head;//火车头节点
    private  int size;//链表长度

    public LinkedList(){
        head=null;
        size=0;
    }
    private class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 链表的头插法
     * @param data 插入的数据
     */
    private void addList(Object data){

    }
    private  void addFirst(Object data){

        //创建新节点
        Node newNode = new Node(data);
        //将新节点插在头部
        newNode.next=head;
        //将新节点置为头节点
        head=newNode;
        size++;
    }

    /**
     * 向链表中差插入数据
     * @param index 指定的索引
     * @param data  插入的数据
     */
    public void add(int index,Object data){
        //判断index是否合法
        if(index<0||index>size){
            throw new  IndexOutOfBoundsException("索引非法！");
        }
        if(index==0){//头插法
            addFirst(data);
        }else {
            //找到index的前驱节点
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {//index-1  找到前驱结点
                prev = prev.next;
            }

            Node newNode = new Node(data);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }


    public void add(Object data){
        //创建新节点存放数据
        Node node = new Node(data);
        node.data =data;
        //进行节点的拼装
    }
}
