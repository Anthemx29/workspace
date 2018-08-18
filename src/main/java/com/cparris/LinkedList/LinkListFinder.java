package com.cparris.LinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class LinkListFinder {

    LinkedList<String> linkedList = new LinkedList<>();

    public void createLinkedList(){
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        for(String str : linkedList){
            System.out.println(str);
        }

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList){

        LinkedList<String> newLinkedList = new LinkedList<>();

        for(int i = linkedList.size() - 1; i >= 0; i--){
            newLinkedList.add(linkedList.get(i));
        }

       return newLinkedList;

    }

    public static Node reverseLinkedList_Recursion(Node node){

        if(Objects.isNull(node)){
            return null;
        }

        if(Objects.isNull(node.nextNode)){
            return node;
        }

        Node secondNode = node.nextNode;

        node.nextNode = null;

        Node reverseNodes = reverseLinkedList_Recursion(secondNode);

        secondNode.nextNode = node;

        return reverseNodes;
    }

   private LinkedList reverse(Node node, LinkedList linkedList){
        if(node == null){
            return linkedList;
        }
        linkedList.addFirst(node.value);
        return this.reverse(node.nextNode, linkedList);
   }

}
