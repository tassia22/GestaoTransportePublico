package GestaoDeTransportePublico;

public class PassagemIdoso extends Passagem{


    public PassagemIdoso(double valorBase,TipoTransporte tipo,Zona zona, boolean horarioPico) {
        super(valorBase,tipo,zona,horarioPico);
    }

    @Override
    public void imprimeValor() {
        double valorFinal = calculaValorBase() * 0.5;
        System.out.println("valor da passagem idoso: gratis ");
    }


}
