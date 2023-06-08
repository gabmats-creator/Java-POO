package introducaoOO;

public class Conta {
    int numeroConta;
    String nomeTitular;
    Double saldo;
    String tipoConta;

    public Conta(int numeroConta, String nomeTitular, Double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void exibeBanco() {
        System.out.println("Banco Nubank.");
    }

    public void sacar(Double valor) {
        if (valor <= saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Não foi possível realizar o saque, insira um valor menor ou igual ao saldo");
        }
    }
    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + valor;
        }
    }
    public Double getSaldo(){
    return this.saldo;
    }
    public String getTitular(){
        return this.nomeTitular;
    }
    public void setTitular(String novoTitular){
        this.nomeTitular = novoTitular;
    }
    public void transferir(Conta destino, double valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso.");
            //this.extrato();
            //destino.extrato();
        }else{
            System.out.println("A transferência não pode ser realizada por falta de saldo");
        }
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    public void extrato(){
        System.out.println("Número da conta: "+ numeroConta);
        System.out.println("Nome do titular: "+ nomeTitular);
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Tipo de conta: "+ getTipoConta());
    }
    }