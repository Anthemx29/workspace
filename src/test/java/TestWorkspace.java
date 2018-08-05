import com.sun.istack.internal.NotNull;
import org.junit.Test;

import java.util.*;

public class TestWorkspace {

    @Test
    public void testLinkeListFindNthElement(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("test");
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("lillian");

        System.out.println("LinkedList Size: "+linkedList.size());

        System.out.println("Nth Object is: "+findNthElement(2, linkedList));
        System.out.println("Last Element is :"+findLastElementLinkedList(linkedList));
    }

    private String findNthElement(int nthPosition, LinkedList<String> list){
        if(list.size() > nthPosition){
            return list.get(nthPosition);
        }else{
            throw new RuntimeException("Error: Position is outside of list size");
        }
    }

    private String findLastElementLinkedList(@NotNull LinkedList<String> list){

        return list.get(list.size() - 1);

    }


    @Test
    public void testSecondCommonElementInTwoArrays(){
        List<Integer> listOne = Arrays.asList(1, 5, 3, 9, 4, 2);
        List<Integer> listTwo = Arrays.asList(4, 7, 10, 3, 2, 9);

        Integer[] array1 = {9, 4, 6, 2, 10, 10};
        Integer[] array2 = {1, 5, 3, 9, 4, 2};

        Set commonElements = new HashSet();

        for(Integer integer : array1){
            if(listOne.contains(integer)){
                commonElements.add(integer);
            }
        }

        System.out.println("Common Elements are : "+commonElements.toString());

        Set commonElementsTwo = new HashSet();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].compareTo(array2[j]) == 0){
                    commonElementsTwo.add(array1[i]);
                }
            }
        }

        System.out.println("Common Elements 2 is : "+commonElementsTwo.toString());

    }

    @Test
    public void testIsAStringAPalandrome(){
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("test");
        listOfStrings.add("anna");
        listOfStrings.add("potop");
        listOfStrings.add("tomnot");

        for (String string : listOfStrings){
            System.out.println("Is "+string+" a palandromd : "+isStringAPalandrome(string));
        }

    }

    private boolean isStringAPalandrome(String testString){
        int beginning = 0;
        int ending = testString.length() - 1;
        while(ending > beginning){
            if(testString.charAt(beginning) != testString.charAt(ending)){
                return false;
            }
            beginning++;
            ending--;
        }
        return true;
    }


    @Test
    public void testQueToStack(){
        Stack<String> inbox = new Stack<>();
        Stack<String> outbox = new Stack<>();

        queue(inbox, "Test");
        queue(inbox, "Hello");
        queue(inbox, "WORLD");

        System.out.println(dequeue(inbox, outbox));
        System.out.println(dequeue(inbox, outbox));
        System.out.println(dequeue(inbox, outbox));

    }

    public void queue(Stack<String> inbox, String item){
        inbox.push(item);
    }

    public String dequeue(Stack<String> outbox, Stack<String> inbox){
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
}
