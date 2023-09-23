package javadesignpatterns-decorator.src.main.java.com.Davi.example;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 17:37:33
 * *
 * @description: Transcrição da quarta série
 **/
public class ForthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("Caro pai XXX:");
        System.out.println(" ......");
        System.out.println(" Chinês 62 Matemática 65 Educação Física 98 Natureza 63");
        System.out.println(" .......");
        System.out.println("assinatura dos pais: ");
    }

    @Override
    public void sign(String name) {
        System.out.println("A assinatura dos pais é: " + name);
    }
}