package br.unipar.clicker;

public class UpgradeMelhorado extends Upgrade{

    public Double valorUpgrade = 20d;

    public void Bonus(){
        this.click = (this.quantidadeUpgrade * 1.5);
    }

    public Double getValorUpgrade() {
        return valorUpgrade;
    }
}
