package br.unipar.clicker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 100;
        Jogador j1=new Jogador();
        Scanner sc = new Scanner(System.in);
        while (opcao!=0) {

            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println("-       Coockie Clicker       -");
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println("-                             -");
            System.out.println("- 1 - Clicar                  -");
            System.out.println("- 2 - Listar cookies          -");
            System.out.println("- 3 - Comprar Upgrade Vovó    -");
            System.out.println("- 4 - Comprar Upgrade Fábrica -");
            System.out.println("- 5 - Listar Upgrades         -");
            System.out.println("-                             -");
            System.out.println("- 0 - Sair                    -");
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println();

            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    j1.clicar();
                break;

                case 2:
                    System.out.println("Quantidade de cookies: "+j1.getCookies());
                break;

                case 3:
                    if(j1.getCookies()<j1.up1.getValorUpgrade()){
                        System.out.println("Sem cookies suficientes\nValor da Vovó:" + j1.up1.getValorUpgrade());
                    }else{
                        j1.up1.CompraUpgrade();
                        j1.comprouUpgrade1();
                    }
                break;

                case 4:
                    if(j1.getCookies()<j1.up2.getValorUpgrade()){
                        System.out.println("Sem cookies suficientes\nValor da Fábrica: " + j1.up2.getValorUpgrade());
                    }else{
                        j1.up2.CompraUpgrade();
                        j1.comprouUpgrade2();
                    }
                break;

                case 5:
                    System.out.println("Quantidade de Upgrades da Vovó: " + j1.up1.getQuantidadeUpgrade());
                    System.out.println("Quantidade de Upgrades da Fábrica: " + j1.up2.getQuantidadeUpgrade());
                break;

                case 0:
                    System.out.println("Obrigado por jogar !_!");
                break;

                default:
                    System.out.println("Opção Inválida.");
                break;
            }
        }
    }
}
