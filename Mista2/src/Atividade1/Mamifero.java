package Atividade1;

public abstract class Mamifero implements Animal {
    private String locomocao;
    private String habitat;
    private String sexo;

    public abstract boolean amamentar();

    public Mamifero(String locomocao, String habitat, String sexo){
        this.locomocao = locomocao;
        this.habitat = habitat;
        this.sexo = sexo;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
