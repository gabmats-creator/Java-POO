package Atividade1;

import java.util.ArrayList;

public class Executor {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Quadrúpede", "Doméstico", "Macho", "Bulldog", "Grande");
        Cachorro cachorro2 = new Cachorro("Quadrúpede", "Doméstico", "Fêmea", "Pug", "Pequeno");
        Gato gato1 = new Gato("Quadrúpede", " Doméstico", "Macho", "Rajada");
        Gato gato2 = new Gato("Quadrúpede", "Doméstico", "Fêmea");
        Baleia baleia1 = new Baleia("Nado", "Aquático", "Fêmea", 2);
        Baleia baleia2 = new Baleia("Nado", "Aquático", "Macho", 2);

        //Polimorfismo
        Mamifero mamifero1 = baleia2;
        Mamifero mamifero2 = cachorro2;

        System.out.println("Locomoção do cachorro: " + cachorro2.getLocomocao());
        System.out.println("Locomoção da baleia: " + baleia1.getLocomocao());
        System.out.println("Habitat do cachorro1: " + cachorro1.getHabitat());
        System.out.println("Cachorro1 é capaz de amamentar? " + cachorro1.amamentar());
        System.out.println("Cachorro2 é capaz de amamentar? " + cachorro2.amamentar());
        System.out.println("Pelagem do gato1: " + gato1.getPelagem());
        System.out.print("Som do cachorro: ");
        cachorro1.emitirSom();
        System.out.print("Som do gato: ");
        gato1.emitirSom();
        System.out.print("Som da baleia: ");
        baleia1.emitirSom();

        //Exemplos de polimorfismo:
        System.out.print("Som do mamífero1: ");
        mamifero1.emitirSom();
        System.out.print("Som do mamífero2: ");
        mamifero2.emitirSom();
    }
}
