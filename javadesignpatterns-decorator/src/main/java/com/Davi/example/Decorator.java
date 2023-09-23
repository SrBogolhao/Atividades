package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 17:43:15
 * *
 * @description: classe abstrata decorativa
 **/
public abstract class Decorator extends SchoolReport {

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
