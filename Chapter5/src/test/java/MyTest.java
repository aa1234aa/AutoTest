import org.testng.annotations.*;

public class MyTest {
    @Test
    public  void func(){
    System.out.print("aa");
    }
    @Test
    public  void func1(){
        System.out.print("BB");
    }
    @BeforeMethod
    public void beforeTest(){
        System.out.print("aa之前");
    }
    @AfterMethod
    public void afterTest(){
        System.out.print("aa之后");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("类之前");
    }
    @AfterClass
    public  void afterClass(){
        System.out.print("类之后");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.print("beforeSuit测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("afterSuite测试套件");
    }
}
