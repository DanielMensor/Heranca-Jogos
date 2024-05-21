package br.unipar.clicker;

public class Jogador {
    private Double cookies=0d;

    Upgrade up1 = new Upgrade();
    Upgrade up2 = new UpgradeMelhorado();

    public void clicar(){
        this.cookies = this.cookies + up1.getClick()+1+ up2.getClick();

    }
    public void comprouUpgrade1(){
        this.cookies = cookies- up1.getValorUpgrade();
    }

    public void comprouUpgrade2(){
        this.cookies = cookies- up2.getValorUpgrade();
    }

    public Double getCookies() {
        return cookies;
    }

}
