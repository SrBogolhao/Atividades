package one.digitalinnovetion.gof.DesafiodeProjetoSingleton;
/**
 * Singleton "aprssado"
 * 
 * @author Davi_SrBogolhao
 */
public class SingletonEager {

    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }
 
}
