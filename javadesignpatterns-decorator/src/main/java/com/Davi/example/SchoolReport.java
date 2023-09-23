package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 11:36:32
 * *
 * @description: transcrição abstrata
 **/
public abstract class SchoolReport {

    //pontuação
    public abstract void report();

    //Assinatura dos pais
    public abstract void sign(String name);
}
