import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    private static Logger log = LoggerFactory.getLogger(Ex1.class);

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("inserisci un numero di parole da inserire");
        int n = input.nextInt();
        input.nextLine();
        Set<String> numParole = new HashSet<>(); //con HashSet creo l'oggetto numParole per memorizzare le parole
        Set<String> numParoleDuplicate = new HashSet<>(); //con HashSet creo l'oggetto numParole per memorizzare le parole duplicate

        for (int i = 0; i < n; i++) {
            System.out.println("inserisci la parola");
            String parola = input.nextLine();

            if (numParole.contains(parola)) {         //verifico se la parola è gia stata inserita
                numParoleDuplicate.add(parola);       //usando il metodo contain
            } else {
                numParole.add(parola);
            }


        }
//faccio un for-each per stampare il numero e l'elenco delle parole
        for (String parola : numParoleDuplicate) {
            log.info("l'elenco delle parole doppie distinte è: " + parola);
        }
        for (String parola : numParole) {
            log.info("l'elenco delle parole distinte è: " + parola);
        }
        log.info("Il numero delle parole distinte è: " + numParole.size());
        input.close();
    }
}
