package javadesignpatterns-decorator.src.main.java.com.Davi.definiton;

/**
 * @author: Davi
 * *
 * @date: 2023-09-23 18:21:18
 * *
 * @description: componentes específicos
 **/
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do sth.");
    }
}