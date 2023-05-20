package br.com.chronosacademy.media;

public class Media {

    public String calcularMedia(double v, double v1) {
        double nota = (v + v1) / 2;
        if (nota < 5){
           return "Reprovado";
        }
        return "Aprovado";
    }
}
