import com.cparris.CopyConstructor.HawaiianShirt;
import com.cparris.CopyConstructor.Person;
import com.cparris.CopyConstructor.Shirt;
import org.junit.Test;

public class TestCopyConstructor {

    @Test
    public void testCopyConstructor(){
        Person person1 = new Person("James", 26, new Shirt("green"));
        System.out.println(person1);

        Person person2 = (Person)person1.clone();
        System.out.println(person2);

        Person person3 = new Person("Andrew", 29, new HawaiianShirt("Hawaiian Colors Duh"));
        System.out.println(person3);

        Person person4 = (Person)person3.clone();
        System.out.println(person4);
    }
}
