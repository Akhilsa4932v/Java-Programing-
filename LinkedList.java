import java.util.*;

public class LinkedList{

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }  
    
    public static Node head;
    public static Node tail;
    public static int size = 0;
    
    
    //add first

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //add in mid
    public void addmid(int idx,int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp = head;
        int i=1;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove first
    public int removeFirst(){
        if(head==null){
            System.out.print("List is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }

    //remove last
    public int removeLast(){
        if(head==null){
            System.out.print("List is empty");
            return -1;
        }

        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        tail = temp;
        temp.next = null;
        size--;
        return val;

    }
    //remove mid node
    public int removeMid(int idx){
        if(head==null){
            System.out.print("List is empty");
            return -1;
        }

        if(idx==size){
            return removeLast();
        }
        if(idx==1){
            return removeFirst();
        }

        Node temp = head;
        int i=1;
        while (i<idx-1) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    //search in ll
    public int search(int ele){
        if(head==null){
            System.out.print("List is empty");
            return -1;
        }
        Node temp = head;
              
       int idx=1;
       while (temp!=null) {
        if(temp.data == ele){
            return idx;
        }
        temp= temp.next;
        idx++;
       }
       return -1;
    }

    //reverse a linkedList
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
     //find mid node
     public int midNode(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
     } 

     //detect loop in ll
     public static boolean isloop(){
        Node slow = head;
        Node fast = head;

       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast){
            return true;
        }
       }
       return false;


     }
    //print Linked list
    public static void print(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //size
    public static void size(){
        System.out.println("Size of linkedList : "+size);
    }


    public static void main(String args[]){
      
      
      head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = null;
       
     System.out.println(isloop());
      
    }
}