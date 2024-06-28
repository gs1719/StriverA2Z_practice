package com.strivera2z.linkedList;

public class linkedListDel {
    static class Node{
        int data;
        Node next;
        public Node(int data){this.data=data;}
    }
    public static int getCount(Node head)
    {

        int counter =0;
        //Code here
        if(head == null){
            return 0;
        }
        else{
            Node curr = head;
            while(curr.next!=null)
            {
                counter++;
                curr = curr.next;
            }
        }
        return counter;
    }
}
