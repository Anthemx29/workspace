import com.cparris.Fibonacci.Fibonacci;
import org.junit.Test;

public class TestFibonacci {

    @Test
    public void testFibonacci(){
        Integer maxSequence = 7;
        Integer fibValue = new Fibonacci().calculateFibonacci(maxSequence);
        System.out.println("The "+maxSequence+" sequence value of Fibonacci sequence is: "+fibValue);
    }
}
