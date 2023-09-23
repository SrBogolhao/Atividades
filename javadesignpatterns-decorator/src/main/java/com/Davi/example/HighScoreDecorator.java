package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-223 11:44:48
 * *
 * @description: Maior pontuação na categoria decoração
 **/
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //Primeiro de tudo você precisa definir o método que deseja embelezar.Primeiro conte ao seu pai sobre a nota mais alta na escola.
    private void reportHighScore() {
        System.out.println("As pontuações mais altas neste exame foram 75 em Português, 78 em Matemática e 80 em Ciências Naturais.");
    }


    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}