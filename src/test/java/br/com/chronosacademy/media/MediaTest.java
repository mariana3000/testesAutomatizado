package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
//        Aprovado
//        Reprovado
@Test
    public void validaAprovado(){
        Media nota = new Media();
        String resultado = nota.calcularMedia(5.0,5.0);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado(){
        Media nota = new Media();
        String resultado = nota.calcularMedia(4.9,5.0);
        assertEquals("Reprovado", resultado);
    }
}