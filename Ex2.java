import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex2 {
    static Logger log = LoggerFactory.getLogger(Ex2.class);
    static Random random = new Random();


    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> ListaCasuale = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {                           //creo la lista
            int numeroCasuale = random.nextInt(101);
            ListaCasuale.add(numeroCasuale);

        }
        Collections.sort(ListaCasuale);
        return ListaCasuale;
    }

    public static List<Integer> generaStessaListaInvertita(List<Integer> lista) {
        List<Integer> ListaCasualeInvertita = new ArrayList<>(lista);
        Collections.reverse(ListaCasualeInvertita);
        lista.addAll(ListaCasualeInvertita);
        return ListaCasualeInvertita;
    }

    public static void printELements(List<Integer> lista, boolean nPari) {
        for (int i = 0; i < lista.size(); i++) {
            if ((nPari && i % 2 == 0) || (!nPari && i % 2 != 0)) {
                System.out.println(lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        List<Integer> ListaCasuale = generaListaCasuale(N);
        System.out.println("Lista casuale ordinata:");
        System.out.println(ListaCasuale);

        List<Integer> ListaCasualeInvertita = generaStessaListaInvertita(ListaCasuale);
        System.out.println("Lista duplicata e invertita:");
        System.out.println(ListaCasualeInvertita);

        System.out.println("numeri pari:");
        printELements(ListaCasualeInvertita, true);

        System.out.println("numeri dispari:");
        printELements(ListaCasualeInvertita, false);

    }

}
