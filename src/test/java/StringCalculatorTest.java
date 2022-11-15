import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
