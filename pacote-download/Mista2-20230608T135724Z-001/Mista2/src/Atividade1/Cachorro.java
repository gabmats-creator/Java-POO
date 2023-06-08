package Atividade1;

public class Cachorro extends Mamifero {
    private String raca;
    private String porte;
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public boolean amamentar() {
        if(this.getSexo().equals("Fêmea") || this.getSexo().equals("fêmea")){
            return true;
        }
        return false;
    }
    //Construtor vazio
    public Cachorro(String locomocao, String habitat, String sexo) {
        super(locomocao, habitat, sexo);
    }
    //Construtor com atributos da classe
    public Cachorro(String locomocao, String habitat, String sexo, String raca, String porte) {
        super(locomocao, habitat, sexo);
        this.raca = raca;
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
