package DesafiodeProjeto;
/**
 * Singleton "Laze Holder"
 * 
 * @author Davi_SrBogolhao
 */
public class SingletonLazyHolder {

    private static class instanceHolder{
         public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getinstancia() {
        return instanceHolder.instancia;
    }
 
}
