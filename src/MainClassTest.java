import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {


    @Test
    public void testGetClassNumber() {
        int actual = this.getClassNumber();

        if (actual > 45) {
            Assert.fail("method getClassNumber returns int less than 45");
        }
    }
}