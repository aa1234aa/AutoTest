package paremeter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//参数化
public class ParameterTest {
   @Test
   @Parameters({"name","age"})
    public void paremeterTest(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
}
