package Exercise_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> setWords = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("inserire il numero di elementi da aggiungere al set");
            int n1 = Integer.parseInt(input.nextLine());
            for (int i = 0; i < n1; i++) {
                System.out.println("inserisci la parola da aggiungere");
                String text = input.nextLine();

                if (setWords.contains(text)) {
                    System.out.println("hai inserito una parola gia esistente");
                    System.out.println(text);
                } else {
                    setWords.add(text);
                    System.out.println("hai aggiunto: " + text);
                }
                for (String t1 : setWords){
                    System.out.println("elenco delle parole inserite");
                    System.out.println("word: "+ t1);
                }
            }
        } catch (Exception ex) {
            System.err.println("errore generico");
        }
    }
}