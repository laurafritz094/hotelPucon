import junit.framework.Assert;
import org.example.Main;
import org.junit.Before;
import org.junit.Test;

public class testMain {

    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }
    @Test
    public void testMain() {
        main.main(null);
    }
    @Test
    public void testMain2() {
        main.main(new String[0]);
    }
    @Test
    public void testMain3() {
        String text = "12";
        Assert.assertTrue(main.EsInteger(text));
    }
    @Test
    public void testMain4() {
        String text = "rt";
        Assert.assertFalse("",main.EsInteger(text));
    }

}
