import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SplitTest {

    @Test
    public void split(){
        String[] values = "1".split(",");
        assertArrayEquals(new String[] {"1"}, values);

        values = "1,2".split(",");
        assertArrayEquals(new String[] {"1","2"}, values);

    }
}
