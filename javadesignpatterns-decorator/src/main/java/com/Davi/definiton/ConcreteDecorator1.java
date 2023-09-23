package javadesignpatterns-decorator.src.main.java.com.Davi.definiton;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 18:22:36
 * *
 * @description: Categoria de decoração de concreto 1
 **/
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("ConcreteDecorator1 method1 decorar");
    }

    private void method2() {
        System.out.println("ConcreteDecorator1 method2 decorar");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
        this.method2();
    }
}
