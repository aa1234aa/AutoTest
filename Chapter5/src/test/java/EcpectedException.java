import org.testng.annotations.Test;

public class EcpectedException {

    //当期望结果是某一个异常的时候
    @Test(expectedExceptions = RuntimeException.class)
    public  void runTimeException(){
        System.out.print("这是一个失败的异常");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public  void runTimeSecess(){
        System.out.print("这是一个失败的异常");
        throw new RuntimeException();
    }
}
