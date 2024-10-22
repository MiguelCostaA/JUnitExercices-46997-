import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    private Main numbers;

    // Metodo executado antes de cada teste
    @BeforeEach
    public void setup () {
        numbers = new Main();
    }

    // Metodo para fornecer numeros primos como fonte de dados para o teste
    private static Stream<Integer> primeNumbers() {
        return Stream.of(3, 23, 311, 487, 653, 947);
    }

    // Metodo para fornecer numeros pares como fonte de dados para o teste
    private static Stream<Integer> evenNumbers() {
        return Stream.of(32, 64, 2, 20, 30, 26);
    }

    // Metodo para fornecer numeros multiplos de 23 como fonte de dados para o teste
    private static Stream<Integer> multipleNumbers() {
        return Stream.of(23, 46, 115, 184, 207, 230);
    }

    // Testa se os numeros fornecidos pelo metodo 'primeNumbers' sao primos
    @ParameterizedTest
    @MethodSource("primeNumbers")
    public void testIsPrime(int number) {
        assertTrue(numbers.isPrime(number), number + "devia ser primo");
    }

    // Testa se os numeros fornecidos pelo metodo 'evenNumbers' sao pares
    @ParameterizedTest
    @MethodSource("evenNumbers")
    public void testIsEven(int number) {
        assertTrue(numbers.isEven(number), number + "devia ser par");
    }

    // Testa se os números fornecidos pelo metodo 'multipleNumbers' sao multiplos de 23
    @ParameterizedTest
    @MethodSource("multipleNumbers")
    public void testIsMultiple(int number) {
        assertTrue(numbers.isMultiple(number,23), number + "devia ser múltiplo de 23");
    }

    // Metodo para fornecer pares de numeros e divisores como fonte de dados para o teste
    private static Stream<Arguments> otherValues(){
        return Stream.of(
                Arguments.of(25,5),
                Arguments.of(100,10),
                Arguments.of(49,7),
                Arguments.of(36,6),
                Arguments.of(81,9),
                Arguments.of(144,12)
        );
    }

    // Testa se os pares de numeros e divisores fornecidos sao multiplos
    @ParameterizedTest
    @MethodSource("otherValues")
    public void testIsMultipleWithOtherValues(int number, int divisor) {
        assertTrue(numbers.isMultiple(number, divisor), number + "devia ser primo");
    }
}
