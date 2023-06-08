package AtividadeVetor;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args){
        System.out.println("Informe a capacidade do vetor: ");
        Scanner s = new Scanner(System.in);
        int capacidade = s.nextInt();
        Vetor vetor = new Vetor(capacidade);
        vetor.inserir(5);
        vetor.inserir(8);
        vetor.inserir(7);
        vetor.inserir(6);
        //vetor.remove(3);
        //vetor.getElementos();
        try{
            vetor.buscaElemento(-12);
        }catch(IllegalArgumentException e){
            System.out.println("Aconteceu uma exceção do tipo: " + e);
        }catch(NumeroNegativoException e){
            System.out.println(e);
        }
        vetor.remove(45);
        vetor.getElementos();
    }
}