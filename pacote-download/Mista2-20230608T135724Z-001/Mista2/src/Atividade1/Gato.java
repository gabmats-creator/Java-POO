package Atividade1;

public class Gato extends Mamifero{
    private String pelagem;
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public boolean amamentar() {
        if(this.getSexo().equals("Fêmea") || this.getSexo().equals("fêmea")){
            return true;
        }
        return false;
    }
    //Construtor vazio
    public Gato(String locomocao, String habitat, String sexo) {
        super(locomocao, habitat, sexo);
    }
    //Construtor com atributos da classe
    public Gato(String locomocao, String habitat, String sexo, String pelagem) {
        super(locomocao, habitat, sexo);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
}
