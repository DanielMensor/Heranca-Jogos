package br.unipar.clicker;

public class Upgrade {


    public Double click=0d;
    public Double quantidadeUpgrade=0d;
    public Double valorUpgrade = 5d;


    public Double getClick() {
        return click;
    }

    public Double getQuantidadeUpgrade() {
        return quantidadeUpgrade;
    }

    public Double getValorUpgrade() {
        return valorUpgrade;
    }

    public void CompraUpgrade(){
        this.quantidadeUpgrade ++;
        Bonus();
        quantidadeUpgrade++;

    }

    public void Bonus(){
        click = quantidadeUpgrade;
    }




}
