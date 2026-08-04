package com.linked_list;

import org.w3c.dom.Node;

public class Ex1_Simple {

    int data;
    Node next;

    Ex1_Simple(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Ex1_Simple(int data1) {
        this.data = data1;
        this.next = null;
    }

}

class LinkedList{
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9};
        Ex1_Simple y = new Ex1_Simple(arr[1]);
        System.out.println("data = " + y.data);
        System.out.println("next = " + y.next);
    }
}


