import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex2 {
    static Logger log = LoggerFactory.getLogger(Ex2.class);
    static Random random = new Random();

    public static void main(String[] args) {


    }

    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> ListaCasuale = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int numeroCasuale = random.nextInt(101);
            ListaCasuale.add(numeroCasuale);

        }
        Collections.sort(ListaCasuale);
        return ListaCasuale;
    }

    public static List<Integer> generaStessaListaInvertita(int N) {
        List<Integer> ListaCasualeInvertita = new ArrayList<>();
        Collections.reverse(ListaCasualeInvertita);
        return ListaCasualeInvertita;
    }

}
