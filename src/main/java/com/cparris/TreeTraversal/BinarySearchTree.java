package com.cparris.TreeTraversal;

import java.util.Objects;

public class BinarySearchTree {

    private Node rootNode;

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void insertNode(int value){
        rootNode = insertNode(rootNode, value);
    }

    private Node insertNode(Node parentNode, int value){

        if(parentNode == null){
            return new Node(value);
        }

        if(value < parentNode.value){
            parentNode.leftNode = insertNode(parentNode.leftNode, value);
        }else if(value > parentNode.value){
            parentNode.rightNode = insertNode(parentNode.rightNode, value);
        }else{
            return parentNode;
        }

        return parentNode;
    }

    public boolean containsNode(int value){
        return containsNode(rootNode, value);
    }

    private boolean containsNode(Node currentNode, int value){
        if(currentNode == null){
            return false;
        }

        if(value == currentNode.value){
            return true;
        }

        if(value < currentNode.value){
            return containsNode(currentNode.leftNode, value);
        }else{
            return containsNode(currentNode.rightNode, value);
        }
    }

    public void traverseTreeInOrder(Node node){
        if(Objects.nonNull(node)){
            traverseTreeInOrder(node.leftNode);
            System.out.println(" node Value: "+node.value);
            traverseTreeInOrder(node.rightNode);
        }
    }

    public void preorderTraversal(Node node){
        if(Objects.nonNull(node)){
            System.out.println("Node Value: "+node.value);
            preorderTraversal(node.leftNode);
            preorderTraversal(node.rightNode);
        }
    }

    public void postOrderTraversal(Node node){
        if(Objects.nonNull(node)){
            postOrderTraversal(node.leftNode);
            postOrderTraversal(node.rightNode);
            System.out.println("Node Value: "+node.value);
        }
    }
}
