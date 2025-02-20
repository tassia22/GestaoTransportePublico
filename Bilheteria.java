package GestaoDeTransportePublico;

import java.util.Scanner;

public class Bilheteria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorBase = 5.10;

        System.out.println("Bem-vindo à Bilheteria de Transporte Público!");
        System.out.println("Escolha o tipo de passagem:");
        System.out.println("1 - Comum");
        System.out.println("2 - Estudante");
        System.out.println("3 - Idoso");
        System.out.println("4 - VIP");
        System.out.println("5 - Mensal");
        System.out.print("Digite o número da opção desejada: ");

        int  opc = scan.nextInt();

        System.out.println("Escolha o tipo de transporte:");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem");
        System.out.print("Digite o número da opção desejada: ");
         int tipoTransporteOpcao = scan.nextInt();
         TipoTransporte tipoTransporte = TipoTransporte.values()[tipoTransporteOpcao - 1];

        System.out.println("Escolha a zona:");
        System.out.println("1 - Zona 1");
        System.out.println("2 - Zona 2");
        System.out.println("3 - Zona 3");
        System.out.print("Digite o número da opção desejada: ");
         int zonaOpcao = scan.nextInt();
        Zona zona = Zona.values()[zonaOpcao - 1];

        System.out.print("É horário de pico? (true/false): ");
        boolean horarioPico = scan.nextBoolean();

        Passagem passagem = null;
        switch (opc){
            case 1:
                passagem = new PassagemComum(valorBase, tipoTransporte, zona, horarioPico);
                break;
            case 2:
                passagem = new PassagemEstudante(valorBase, tipoTransporte, zona, horarioPico);
                break;
            case 3:
                passagem = new PassagemIdoso(valorBase, tipoTransporte, zona, horarioPico);
                break;
            case 4:
                passagem= new PassagemVIP(valorBase, tipoTransporte, zona, horarioPico);
                break;
            default:
                System.out.println("opcao invalida");
        }
        if(passagem != null){
            passagem.imprimeValor();
        }


        scan.close();
    }
}
