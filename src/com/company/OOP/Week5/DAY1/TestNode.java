package com.company.OOP.Week5.DAY1;

/**
 * Created by User on 17.10.2015.
 */
public class TestNode {
    public static void main(String[] args) {
        Node node = new Node(1,null);
        Node node1 = new Node(2, null);

        node.next = node1;
        Node node2 = new Node(3, node);

        Node chain = new Node(5,new Node(4, new Node(3, new Node(2, null))));


    }
}
