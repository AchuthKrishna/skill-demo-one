import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testMethod(){
        assertEquals(10, SkillDemo.multiply(5, 2));
    }
}
