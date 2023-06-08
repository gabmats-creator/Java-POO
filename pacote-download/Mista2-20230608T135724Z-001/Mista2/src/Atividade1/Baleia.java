package Atividade1;

public class Baleia extends Mamifero{
    private int numeroNadadeiras;

    //Construtor vazio
    public Baleia(String locomocao, String habitat, String sexo) {
        super(locomocao, habitat, sexo);
    }
    //Construtor com atributos da classe
    public Baleia(String locomocao, String habitat, String sexo, int numeroNadadeiras){
         super(locomocao, habitat, sexo);
         this.numeroNadadeiras = numeroNadadeiras;
    }

    @Override
    public void emitirSom() {
        System.out.println("UUUUUUUUUU");
    }

    @Override
    public boolean amamentar() {
        if(this.getSexo().equals("Fêmea") || this.getSexo().equals("fêmea")){
            return true;
        }
        return false;
    }

    public int getNumeroNadadeiras() {
        return numeroNadadeiras;
    }

    public void setNumeroNadadeiras(int numeroNadadeiras) {
        this.numeroNadadeiras = numeroNadadeiras;
    }
}
