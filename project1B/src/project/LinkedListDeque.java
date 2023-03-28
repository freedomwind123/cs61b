package project;
import java.util.LinkedList;

public class LinkedListDeque<Item> implements Deque<Item>{

    public static int size;

    /* 哨兵节点 */
    public LinkedNode semeter;

    public class LinkedNode{
        public Item val;
        public LinkedNode prev;
        public LinkedNode next;
        public LinkedNode(LinkedNode p, Item value, LinkedNode n){
            prev = p;
            val = value;
            next = n;
        }
    }
    public LinkedListDeque(){
        semeter = new LinkedNode(null ,null, null);
        semeter.next = semeter;
        semeter.prev = semeter;
        size = 0;
    }
    public void addFirst(Item x){
        LinkedNode p = new LinkedNode(null, x, null);
        p.next = semeter.next;
        p.prev = semeter;
        semeter.next = p;
        size++;
    }
    public void addLast(Item x){
        LinkedNode p = new LinkedNode(null, x, null);
        semeter.prev.next = p;
        p.prev = semeter.prev;
        p.next = semeter;
        semeter.prev = p;
        size++;
    }
    public Item removeFirst(){
        Item num = semeter.next.val;
        semeter.next.next.prev = semeter;
        semeter.next = semeter.next.next;
        size--;
        return num;
    }
    public Item removeLast(){
        Item num = semeter.prev.val;
        semeter.prev.prev.next = semeter;
        semeter.prev = semeter.prev.prev;
        return num;
    }
    public Item get(int index){
        LinkedNode p = semeter;
        while(index >= 0){
            p = p.next;
        }
        return p.val;
    }
    public int size(){
        return this.size;
    }
    public LinkedNode q = semeter;
    public Item getRecursive(int index){
        if(index == 0)
            return q.next.val;
        q = q.next;
        return getRecursive(index - 1);
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void printDeque(){
        LinkedNode p = semeter;
        int index = size;
        while(index > 0){
            System.out.println(p.val);
            p = p.next;
            index--;
        }
    }
}
