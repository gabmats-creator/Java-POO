package Heranca;

public class ControledeVale {
    public double TotalDeVale = 0;
    public ControledeVale(){}

    public void registra(Funcionario funcionario){
        this.TotalDeVale += funcionario.getValeAlimentacao();
    }
    public double getTotalVale(){
        return this.TotalDeVale;
    }
}

