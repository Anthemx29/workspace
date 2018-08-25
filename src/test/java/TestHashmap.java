import com.cparris.HashMapFun.HashMapFunctions;
import org.junit.Test;

import java.util.*;

public class TestHashmap {

    @Test
    public void testHashmapFun(){
        List<Integer> listOfNumbers = Arrays.asList(2, 4, 3, 2, 1);

        HashMapFunctions.findTwoNumbersThatSumToGivenValue_BigO_N(listOfNumbers, 5);


    }

    @Test
    public void testFirstNonRepeated(){
        System.out.println(HashMapFunctions.findFirstNonRepeatingCharacterInString("ABACBD"));
    }

}
