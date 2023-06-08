package AtividadeVetor;

import javax.naming.InterruptedNamingException;
import java.util.Arrays;

public class Vetor {
    private int[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.elementos = new int[capacidade];
    }
    public int tamanho(){
        return this.tamanho;
    }
    public boolean vazio(){
        return this.tamanho == 0;
    }
    public boolean cheio(){
        return this.tamanho == this.capacidade;
    }
    public int buscaElemento(int indice){
        if (indice< 0){
            throw new NumeroNegativoException("Ocorreu um erro ao realizar a busca de índices negativos no vetor");
        }
        if(indice > this.capacidade){
            throw new IndexOutOfBoundsException();
        }
        return this.elementos[indice];
    }
    public void inserir(int elemento) {
        if (this.cheio()) {
            this.aumentarCapacidade();
            System.out.println("Lista cheia, não é possível inserir elementos no vetor.");
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }
    public void remove(int indice){
        if(indice < 0){
            throw new NumeroNegativoException("Ocorreu um erro ao realizar a busca de índices negativos no vetor");
        }
        if(indice > this.capacidade) {
            System.out.println("Indice inexistente, Tente novamente");
        }
        for (int i = indice; i< this.capacidade - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho --;
    }
    private void aumentarCapacidade(){
        this.capacidade = this.capacidade*2;
        int[] vetorNovo = new int[this.capacidade];
        for (int i = 0; i <this.tamanho ; i++) {
            vetorNovo[i] = this.elementos[i];
        }
        this.elementos = vetorNovo;
    }
    public void getElementos() {
        for (int i = 0; i < this.capacidade; i++) {
            System.out.println("Vetor na posição " + i + " é igual a " + this.elementos[i]);
        }
    }
    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

