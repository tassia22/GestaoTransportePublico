package GestaoDeTransportePublico;

public class PassagemComum extends Passagem{

    public PassagemComum(double valorBase,TipoTransporte tipo,Zona zona, boolean horarioPico) {
        super(valorBase,tipo,zona,horarioPico);
    }

    @Override
    public void  imprimeValor(){
        double valorFinal = calculaValorBase();
        System.out.println("valor da passagem comum: "+String.format("%.2f", valorFinal));
    }

}
