package com.linked_list;

class Node1{
    int data;
    Node1 next;

    Node1(int data, Node1 next){
        this.data = data;
        this.next = next;
    }

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class FindLengthInLinkedList {
    public static void main(String[] args) {
        int[] arr ={2,4,8,10};
        int count = 0;
        Node1 head = convertArrayToLL(arr);
        Node1 temp = head;
        while(temp != null){
            count++;
            System.out.print(" " + temp.data);
            temp = temp.next;
        }

        System.out.println(" size = " + count);
    }

    private static Node1 convertArrayToLL(int[] arr) {
        Node1 head = new Node1(arr[0]);
        Node1 mover = head;

        for(int i=1;i< arr.length;i++){
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
