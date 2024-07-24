import org.testng.annotations.Test;

public class FirstTestngTest {

//    If we have 1+ @test annotation then it will be excuted in alphabetical order
//    So if we want to execute in order we can set priority parameter

    //    @Test
    @Test(priority = 0)
    void setUp() {
        System.out.println("Browser is getting set to launch....1");
    }

    //    @Test
    @Test(priority = 2)
    void login() {
        System.out.println("This is login Test....1");
    }

    //    @Test
    @Test(priority = 4)
    void tearDown() {
        System.out.println("Closing Browser....1");
    }

}
