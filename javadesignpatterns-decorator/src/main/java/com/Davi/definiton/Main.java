package javadesignpatterns-decorator.src.main.java.com.Davi.definiton;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 17:36:10
 * *
 * @description: Aula de cena
 **/
public class Main {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component = new ConcreteDecorator1(component);

        component = new ConcreteDecorator2(component);

        component.operate();
    }
}