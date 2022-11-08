import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    private Calculator cal;

    @BeforeEach
    public void setUp(){
        cal = new Calculator();
        System.out.println("setUp");
    }

    @Order(1) //테스트 순서 정하는 어노테이션
    @DisplayName("덧셈")
    @Test
    public void add(){
        assertEquals(6,cal.add(2,4));
        System.out.println("덧셈");
    }

    @Order(2)
    @DisplayName("뺄셈")
    @Test
    public void substract(){
        assertEquals(2,cal.substract(5,3));
        System.out.println("뺄셈");
    }

    @Order(3)
    @DisplayName("곱셈")
    @Test
    public void multiply(){
        assertEquals(16,cal.multiply(4,4));
        System.out.println("곱셈");
    }

    @Order(4)
    @DisplayName("나눗셈")
    @Test
    public void divide(){
        assertEquals(5,cal.divide(10,2));
        System.out.println("나눗셈");
    }

    @AfterEach
    public void tearDown(){
        cal = null;
        System.out.println("tearDown");
    }
}
