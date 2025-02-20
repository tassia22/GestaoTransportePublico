package GestaoDeTransportePublico;

public class PassagemEstudante extends Passagem {


    public PassagemEstudante(double valorBase,TipoTransporte tipo,Zona zona, boolean horarioPico) {
        super(valorBase,tipo,zona,horarioPico);
    }

    @Override
    public void imprimeValor() {
        double valorFinal = calculaValorBase() * 0.5;
        System.out.println("valor da passagem estudante: "+String.format("%.2f", valorFinal));

    }

}
