package Heranca;

public class EncarregadoSetor extends Funcionario {
    private String setorEncarregado;
    private String turno;

    public String getSetorEncarregado() {
        return setorEncarregado;
    }

    public void setSetorEncarregado(String setorEncarregado) {
        this.setorEncarregado = setorEncarregado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public EncarregadoSetor(String nome, String cpf, double salario, String setorEncarregado, String turno) {
        super(nome, cpf, salario);
        this.setorEncarregado = setorEncarregado;
        this.turno = turno;
    }

    public EncarregadoSetor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao(){
        return this.getSalario() *0.5 + 500;
    }
    @Override
    public double getValeAlimentacao(){
        return this.getSalario() * 0.5;
    }

}
