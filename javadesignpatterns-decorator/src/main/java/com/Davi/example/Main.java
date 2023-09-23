package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 11:36:10
 * *
 * @description: Aula de cena
 **/
public class Main {

    public static void main(String[] args) {
        SchoolReport report = new ForthGradeSchoolReport();

        report = new HighScoreDecorator(report);

        report = new SortDecorator(report);

        report.report();
        report.sign("Roberto");
    }
}