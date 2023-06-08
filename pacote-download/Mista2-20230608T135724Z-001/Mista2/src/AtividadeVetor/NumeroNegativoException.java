package AtividadeVetor;

public class NumeroNegativoException extends RuntimeException{
    public NumeroNegativoException(){
        super("Uma exceção de número negativo ocorreu. ");
    }
    public NumeroNegativoException(String mensagem){
        super(mensagem);
    }
}
