import com.cparris.LinkedList.LinkListFinder;
import com.cparris.LinkedList.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    LinkedList<String> linkedList = new LinkedList<>();

    @Before
    public void beforeClass(){
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        for(String str : linkedList){
           // System.out.println(str);
        }
    }

    @Test
    public void testLinkedList_ReverseList(){

        System.out.println("_______ Normal Order_______");

        for(String str : linkedList){
            System.out.println(str);
        }

        System.out.println("_______ Reverse Order_______");
        LinkedList<String> reversedList = LinkListFinder.reverseLinkedList(linkedList);

        for(String str : reversedList){
            System.out.println(str);
        }

    }

    @Test
    public void testCustomLinkedList_Recursion(){
        Node node = new Node();
        node.value = "A";
        node.nextNode = new Node("B");
        node.nextNode.nextNode =  new Node("C");
        node.nextNode.nextNode.nextNode =  new Node("D");

        System.out.println("First Node: "+node.value);

        node = LinkListFinder.reverseLinkedList_Recursion(node);

        System.out.println("First Node: "+node.value);
    }

}
