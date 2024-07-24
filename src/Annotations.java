import org.testng.annotations.*;

/*
beforeSuite -> beforeTest -> beforeClass -> beforeMethod -> Test
 */

public class Annotations
{
    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will be executed before Class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This will be executed after Class");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will be executed before every method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will be executed after every method");
    }
    @Test
    void test1()
    {
        System.out.println("This is test1.....");
    }
    @Test
    void test2()
    {
        System.out.println("This is test2.....");
    }

}
