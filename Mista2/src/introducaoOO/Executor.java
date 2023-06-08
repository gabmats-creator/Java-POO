package introducaoOO;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta1 = new Conta(0001, "Gabriel", 20.00, "Corrente");
        Conta conta2 = new Conta(0002, "Thiago", 25.00, "Poupança");
        conta1.extrato();
        conta2.extrato();
        conta1.transferir(conta2, 10);
        conta1.extrato();
        conta2.extrato();
        //conta1.sacar(23.00);
    }
}
