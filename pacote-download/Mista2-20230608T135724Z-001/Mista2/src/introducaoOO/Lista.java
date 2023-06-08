package introducaoOO;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(); //programe sempre voltado para a interface
        nomes.add("Gabriel");
        nomes.add("João");
        nomes.add("Guilherme");
        nomes.add(0, "Carlos");
        nomes.remove("Ana");
        for(int i=0; i<=nomes.size()-1;i++){
            Math.sqrt(23);
            System.out.println(nomes.contains("João"));
            Collections.sort(nomes);
            System.out.println(nomes);
        }
    }
}
