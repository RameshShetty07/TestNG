import org.testng.annotations.Test;

public class PriorityAndDisabligTest {
    @Test(priority = 1)
    void testOne() {
        System.out.println("This is Test1...");
    }

    @Test(priority = 2)
    void testTwo() {
        System.out.println("This is Test2...");
    }

    @Test(priority = 3,enabled = false)
    void testThree() {
        System.out.println("This is Test3...");
    }

    @Test(priority = 4)
    void testFour() {
        System.out.println("This is Test4...");
    }

}
