import org.testng.annotations.*;

public class TC2 {
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
    void test3()
    {
        System.out.println("This is test3.....");
    }
    @Test
    void test4()
    {
        System.out.println("This is test4.....");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This is beforeTest.....");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("This is afterTest.....");
    }


}
