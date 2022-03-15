import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void shouldGetLenghtOfString() {

        String teststring="Hello World!";
        Assert.assertEquals(teststring.length(),12);
    }

    @Test
    public void shouldAddTwoNumbers(){
        int sum = new Calculator().getSum(10, 20);
        Assert.assertEquals(sum,30);
    }



    @Test
    public void shouldMultiplyTwoNumbers(){
        int result =new Calculator().getResult(20, 10);
        Assert.assertEquals(result,200);
    }




}