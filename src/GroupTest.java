import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = {"functional"})
    void test1()
    {
        System.out.println("This is Test1...");
    }
    @Test(groups = {"functional"})
    void test2()
    {
        System.out.println("This is Test2...");
    }
    @Test(groups = {"regression"})
    void test3()
    {
        System.out.println("This is Test3...");
    }
    @Test(groups = {"regression"})
    void test4()
    {
        System.out.println("This is Test4...");
    }
    @Test(groups = {"functional","regression"})
    void test5()
    {
        System.out.println("This is Test5...");
    }
}
