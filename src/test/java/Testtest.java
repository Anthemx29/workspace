import org.junit.Test;

import java.util.Objects;

public class Testtest {

    private String PREFIX = "";
    private String sampleString = "abc";

    @Test
    public void testPermutation(){

        permutation(PREFIX, sampleString);


    }


    @Test
    public void testTest(){
        permutation(sampleString);
    }

    public void permutation(String pre, String sample){
        if(sample.isEmpty()){
            System.out.println(pre + sample);
        }else {
            for (int i = 0; i < sample.length(); i++) {
                System.out.println("I: "+i+" PRE: "+pre+" SAMPLE: "+sample);
                permutation(pre + sample.charAt(i), sample.substring(0, i) + sample.substring(i + 1, sample.length()));

            }
        }
    }

    public void permutation(String sample){
        char[] testArray = sample.toCharArray();
        String temp = "";

        for(int i = 0; i < sample.length(); i++){
            System.out.println(testArray[i]);
        }

    }



}
