package javadesignpatterns-decorator.src.main.java.com.Davi.definiton;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 17:21:46
 * *
 * @description: decorador abstrato
 **/
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
