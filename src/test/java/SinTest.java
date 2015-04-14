import com.alexseenko.Sin;
import org.junit.Assert;
import org.junit.Test;

public class SinTest {
    @Test
    public void Sin() {
        Assert.assertEquals(Sin.value(-2 * Math.PI), 0, 0.001);
        Assert.assertEquals(Sin.value(-1.5 * Math.PI), 1, 0.001);
        Assert.assertEquals(Sin.value(-Math.PI), 0, 0.001);
        Assert.assertEquals(Sin.value(-0.5 * Math.PI), -1, 0.001);
        Assert.assertEquals(Sin.value(0), 0, 0.001);
        Assert.assertEquals(Sin.value(0.5 * Math.PI), 1, 0.001);
        Assert.assertEquals(Sin.value(1 * Math.PI), 0, 0.001);
        Assert.assertEquals(Sin.value(1.5 * Math.PI), -1, 0.001);
        Assert.assertEquals(Sin.value(2 * Math.PI), 0, 0.001);
        
    }
    public class HeapSort {
        
    }
}


