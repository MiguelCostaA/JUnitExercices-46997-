import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Teste do metodo 'area' da classe Main, que deve calcular a area de um retângulo
    @Test
    public void testArea() {
        Main rectangle = new Main();

        int areaResult = rectangle.area(3, 5);
        assertEquals(15, areaResult);
    }

    // Teste do metodo 'Perimetro' da classe Main, que deve calcular a area de um retângulo
    @Test
    public void testPerimeter() {
        Main rectangle = new Main();

        int perimeterResult = rectangle.perimeter(5, 4);
        assertEquals(18, perimeterResult);
    }

    // Teste do metodo 'isTriangle' da classe Main, que verifica se os valores podem formar um triângulo
    @Test
    public void testIsTriangle() {
        Main rectangle = new Main();

        // Teste 1: Triangulo possível (3, 4, 5) - Este é um triângulo válido
        int result1 = rectangle.isTriangle(3, 4, 5);
        assertEquals(1, result1);
    }
}