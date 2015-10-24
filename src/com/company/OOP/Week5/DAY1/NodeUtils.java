package com.company.OOP.Week5.DAY1;

/**
 * Created by User on 17.10.2015.
 */
public class NodeUtils {
    public static Node addToHead(Node head, Node newNode){
        newNode.next = head;
        return newNode;
    }

    public static void print(Node head){
        Node iter = head;
        while (iter != null) {
            System.out.printf("%s->", iter.value);
            iter = iter.next;
        }
    }

    public static String addToString(Node head){
        return  "";
    }

    public static Node create(Object...mas){
        if (mas == null || mas.length == 0)
            return null;
        Node head = null;

        Node tail = head;
        head = new Node(mas[0],tail);
        for (int i = 1; i < mas.length; i++) {
            tail.next=new Node(mas[i], null);
            tail = tail.next;
        }
        return head;
    }

    public static void addToTail(Node head, Node newNode){
        while(head.value != null){
            newNode.next = head;
        }
    }

    public static void addByIndex(Node head, int position, Node newNode){

    }

    public static Node reverse(Node head){
        return null;
    }

    public static Node sort(Node head){
        return null;
    }
}
