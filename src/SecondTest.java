import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest
{
    @Test(priority = 1)
    void setUp() {
        System.out.println("Browser is getting set to launch....2");
    }

    @Test(priority = 3)
    void login() {
        System.out.println("This is login Test....2");
    }

    @Test(priority = 5)
    void tearDown() {
//        System.out.println("Closing Browser....2");
        Assert.assertEquals(0,1);
    }
}
