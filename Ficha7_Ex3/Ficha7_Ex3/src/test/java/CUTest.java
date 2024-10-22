import org.example.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CUTest {

    private CU cu;

    // Metodo que e executado antes de cada teste, inicializa a CU e numero de estudantes
    @BeforeEach
    public void setup() {
        cu = new CU("Matemática", 3);
    }

    // Testa a inserçao de uma nota e verifica se a nota do estudante foi retornada corretamente
    @Test
    public void testInsertMarkCU(){
        cu.insertMarkCU(1, 15.0);
        assertEquals(15.0, cu.searchStudent(1), "A nota do aluno 1 é 15.0");
    }

    // Testa a procura por um estudante que nao existe, esperado o retorno de -1
    @Test
    public void testSearchNonExistingStudent(){
        assertEquals(-1, cu.searchStudent(3),"Aluno não existe, retornar -1");
    }

    // Teste parametrizado que insere e procura as notas de diferentes estudantes
    @ParameterizedTest
    @CsvSource ( {
            "1, 15.0",
            "2, 10.0",
            "3, 8.0"
    })
    public void testInsertAndSearchStudent(int numStudent, double mark){
        cu.insertMarkCU(numStudent, mark);
        assertEquals(mark, cu.searchStudent(numStudent), "A note do aluno " + numStudent + " deve ser de " + mark);
    }

    // Testa o calculo da media de notas da CU
    @Test
    public void testAverageCU(){
        cu.insertMarkCU(1,15.0);
        cu.insertMarkCU(2,10.0);
        cu.insertMarkCU(3,8.0);
        assertEquals(11.0, cu.averageCU(), "A média é 11.0");
    }

    // Teste parametrizado para verificar se os alunos foram aprovados com base nas suas notas
    @ParameterizedTest
    @CsvSource ({
            "1, 15.0, true",
            "2, 10.0, true",
            "3, 8.0, false"
    })
    public void testIsApproved(int numStudent, double mark, boolean expected){
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.isApproved(numStudent), "O aluno " + numStudent + "deve ser aprovado" + expected);
    }
}
