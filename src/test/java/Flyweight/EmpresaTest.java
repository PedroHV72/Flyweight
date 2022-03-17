package Flyweight;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Pedro", "Engenheiro de Software", 3000.0f);
        empresa.contratar("Ana", "Técnico em Alimentos", 2000.0f);
        empresa.contratar("Lucas", "Técnico em Alimentos", 2000.0f);

        List<String> retorno = Arrays.asList(
                "Pessoa{nome='Pedro', cargo='Engenheiro de Software', salario='3000.0'}",
                "Pessoa{nome='Ana', cargo='Técnico em Alimentos', salario='2000.0'}",
                "Pessoa{nome='Lucas', cargo='Técnico em Alimentos', salario='2000.0'}");

        assertEquals(retorno, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCargos() {
        Empresa empresa = new Empresa();
        empresa.contratar("Pedro", "Engenheiro de Software", 3000.0f);
        empresa.contratar("Ana", "Técnico em Alimentos", 2000.0f);
        empresa.contratar("Lucas", "Técnico em Alimentos", 2000.0f);

        assertEquals(2, CargoFactory.getTotalCargos());
    }
}
