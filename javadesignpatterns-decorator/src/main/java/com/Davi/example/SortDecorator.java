package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 17:09:35
 * *
 * @description: Decorador de status de classificação
**/

public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //Depois que meu pai ler a transcrição, farei um relatório sobre a classificação da escola.
    private void reportSort() {
        System.out.println("Estou em 38º lugar...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
