import com.cparris.patterns.BuilderPattern.Engine;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilderPattern {

    @Test
    public void testBuildPattern(){

        /**
         * Effective Java Version 3
         */

        Engine engine = new Engine
                .Builder("AC Delco Cabin Air Filter", "NAPA Dino Oil Filter")
                .alternator("AC Delco Alternator")
                .oil("Pennzoil 5w20")
                .oilFilter("Pennzoil Max Life").build();

        Assert.assertTrue("Failure to build Engine", engine.getAirFilter().equalsIgnoreCase("AC Delco Cabin Air Filter"));
    }
}
