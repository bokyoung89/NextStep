import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private StringCalculator cal;

    @BeforeEach
    public void setUp(){
        cal = new StringCalculator();
    }

    @Test
    public void add_null_또는_빈문자(){
        assertEquals(0,cal.add(null));
        assertEquals(0,cal.add(""));
    }

    @Test
    public void add_숫자하나(){
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자(){
        assertEquals(3,cal.add("1,2"));
    }

    @Test
    public void add_쉼표_또는_콜론_구분자(){
        assertEquals(6, cal.add("1,2:3"));
    }

    @Test
    public void add_custom_구분자(){
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test
    public void add_nagative(){
        assertThrows(RuntimeException.class, () -> {
            cal.add("-1,2,3");
        });
    }
}
