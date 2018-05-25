package paremeter;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateProvider {
    @Test(dataProvider = "data")
    public void dataPro(String name ,int age){
        System.out.println("name:"+name+";age:"+age);

    }
    @DataProvider(name="data")
    public Object[][] provider(){
        Object[][] o=new Object[][]{
                {"zhangsan",10}
        };
        return o;
    }
}
