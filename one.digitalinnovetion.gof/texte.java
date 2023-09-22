package one.digitalinnovetion.gof.DesafiodeProjetoSingleton;

//singleton

public class texte {
    public static void main(String[]args) {
        SingletonLazy lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    }

//strategy

Comportamento defencivo = new ComportamentoDefenssivo();
Comportamento normal = new ComportamentoNormal();
Comportamento agressico = new ComportamentoAgressivo();

Robo robo = new Robo();
robo.setComportamento(normal);

robo.mover();
robo.mover();
robo.setComportamento(agressico);

robo.mover();

robo.setComportamento(defencivo);

robo.mover();
robo.mover();
robo.mover();

//Facede
Facede facede = new Facede();
facede.migrarCliente("Venilton", "31425688621");
}
