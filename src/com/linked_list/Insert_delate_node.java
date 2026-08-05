package com.linked_list;

class Node2{
    int data;
    Node2 next;

    Node2(int data,Node2 next){
        this.data=data;
        this.next=next;
    }

    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

public class Insert_delate_node {
    public static void main(String[] args) {
        int[] arr ={2,4,8,10};
        int value = 100;

        Node2 head = arrayToLL(arr);

//        head = insertfirst(value, head);
        head = insertLast(value, head);
        Node2 temp = head;
        while(temp != null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    private static Node2 insertLast(int value, Node2 head) {
        Node2 newNode = new Node2(value);

        if(head == null){
            return newNode;
        }

        Node2 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    private static Node2 arrayToLL(int[] arr) {
        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for(int i=1;i< arr.length;i++){
            Node2 newNode = new Node2(arr[i]);
            mover.next = newNode;
            mover = newNode;
        }
        return head;
    }

    private static Node2 insertfirst(int value, Node2 head) {
        Node2 newNode = new Node2(value);
        newNode.next = head;
        head = newNode;

        return head;
        }
    }
