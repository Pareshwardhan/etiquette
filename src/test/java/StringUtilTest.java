import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void shouldGetLenghtOfString() {

        String teststring="Hello World!";
        Assert.assertEquals(teststring.length(),12);

    }

}
