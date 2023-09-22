package one.digitalinnovetion.gof.DesafiodeprojetoStrategy;

public class Bobo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
