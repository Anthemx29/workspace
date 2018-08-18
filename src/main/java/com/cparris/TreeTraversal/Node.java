package com.cparris.TreeTraversal;

/**
 * Node used in Binary Search Tree. Has a left node, and a right node, and a value, for this demo it's just an integer.
 */
public class Node {

    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(){}

    public Node(int value){
        this.value = value;
        leftNode = null;
        rightNode = null;
    }


}
