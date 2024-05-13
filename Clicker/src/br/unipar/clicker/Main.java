package br.unipar.clicker;

public class Main {
    public static void main(String[] args) {
        Upgrade up = new Upgrade();
        up.CompraUpgrade();
        System.out.println(up.getClick());
        UpgradeMelhorado upp = new UpgradeMelhorado();
        upp.CompraUpgrade();
        upp.CompraUpgrade();
        System.out.println(upp.getClick());

    }

}
