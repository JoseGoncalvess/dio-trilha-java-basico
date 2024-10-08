package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.studyTest.classJunit.Pessoa;
import org.studyTest.classsMocks.Endereco;

public class validatorAssertions {

    @Test
    void validarArraysEqual(){
        int[] listOne = {1, 2, 3, 6};
        int[] listTwo = {1, 2, 3, 6};
        Assertions.assertArrayEquals(listOne,listTwo);
    }
    @Test
    void validarArraysNotEqual(){
        int[] listOne = {1, 2, 2, 6};
        int[] listTwo = {1, 2, 3, 6};
        Assertions.assertArrayEquals(listOne,listTwo);
    }
    @Test
    void validarPessoalIsNull(){
        Pessoa eu = null;
        Assertions.assertNull(eu);
    }
    void validarPessoalIsNotNull(){
        Pessoa eu = new Pessoa("Gonçalves",23,new Endereco("RUA", 1234, 13));
        Assertions.assertNotNull(eu);
    }



}
