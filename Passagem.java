package GestaoDeTransportePublico;

public abstract class  Passagem {
    protected  double valorBase;
    protected TipoTransporte tipo;
    protected Zona zona;
    protected boolean horarioPico;

    public Passagem(double valorBase, TipoTransporte tipo, Zona zona, boolean horarioPico) {
        this.valorBase = valorBase;
        this.tipo = tipo;
        this.zona = zona;
        this.horarioPico = horarioPico;
    }

    public double calculaValorBase(){
        double valor = valorBase;

        switch (zona){
            case ZONA_2:
                valor*=1.20;
                break;
            case ZONA_3:
                valor*=1.40;
                break;
        }
        if (horarioPico){
            valor*=1.15;
        }
        return valor;
    }

    public abstract void imprimeValor();

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public boolean isHorarioPico() {
        return horarioPico;
    }

    public void setHorarioPico(boolean horarioPico) {
        this.horarioPico = horarioPico;
    }
}
