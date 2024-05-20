package br.unipar.clicker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Jogador j1=new Jogador();
        Scanner sc = new Scanner(System.in);
        while (opcao!=5) {
            System.out.println("Menu:\n1 para clicar\n2 para listar dinheiro\n3 para comprar Vovó fazedora de biscoito\n4 para comprar fábrica de biscoito\n5 para parar de jogar");
            opcao = sc.nextInt();
            switch (opcao){
                case 1: j1.clicar();
                        break;
                case 2:
                    System.out.println("Quantidade de cookies:"+j1.getCookies());
                        break;
                case 3: if(j1.getCookies()<j1.up1.getValorUpgrade()){
                    System.out.println("Sem cookies suficientes\nValor da Vovó:" + j1.up1.getValorUpgrade());
                }else{
                    j1.up1.CompraUpgrade();
                    j1.comprouUpgrade1();
                }
                break;
            }

        }
    }

}
