package suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.print("beforeSuit测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("afterSuite测试套件");
    }
    @BeforeTest
    public void beforeClass(){
        System.out.print("类之前");
    }
    @AfterTest
    public  void afterClass(){
        System.out.print("类之后");
    }

}
