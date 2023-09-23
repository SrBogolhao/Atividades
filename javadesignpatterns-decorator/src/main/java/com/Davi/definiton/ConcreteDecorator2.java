package javadesignpatterns-decorator.src.main.java.com.Davi.definiton;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 18:22:36
 * *
 * @description: Categoria de decoração de concreto 1
 **/
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method() {
        System.out.println("ConcreteDecorator2 method decorar");
    }

    @Override
    public void operate() {

        super.operate();

        this.method();
    }
}