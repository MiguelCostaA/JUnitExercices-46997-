import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private Main number;

    // Metodo que e executado antes de cada teste para inicializar a instancia de Main
    @BeforeEach
    public void setUp() {
        number = new Main();
    }

    // Teste para o metodo 'averageDigit' com um numero positivo
    @Test
    public void testAveragePositiveDigits() {
        int num = 12345;
        double expectedAverage = 3.0;
        double result = number.averageDigit(num);
        assertEquals(expectedAverage, result, 0.001);
    }
}
