package com.cparris.TreeStructuresInJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a generic tree structure in Java to store any type of data
 * @param <T>
 */
public class Tree<T> {

    private Node<T> rootNode;

    public Tree(T rootData){
        rootNode = new Node<T>();
        rootNode.data = rootData;
        rootNode.childrenNodes = new ArrayList<Node<T>>();
    }

    public class Node<T>{
        private T data;
        private Node<T> parentNode;
        private List<Node<T>> childrenNodes;
    }
}
