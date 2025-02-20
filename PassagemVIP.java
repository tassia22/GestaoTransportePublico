package GestaoDeTransportePublico;

public class PassagemVIP extends Passagem{

    public PassagemVIP(double valorBase,TipoTransporte tipo,Zona zona, boolean horarioPico) {
        super(valorBase,tipo,zona,horarioPico);
    }

    @Override
    public void  imprimeValor() {
        double valorFinal = calculaValorBase() * 1.30;
        System.out.println("valor da passagem vip: "+String.format("%.2f", valorFinal));

    }


}
