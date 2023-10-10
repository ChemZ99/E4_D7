package Exercise_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap Rubrica = new HashMap<String,String>();
        Scanner input = new Scanner(System.in);
        System.out.println("1 per aggiungere, 2 per cancellare, 3 per ricerca con numero, 4 per ricerca con nome, 5 per stampare, 0 per uscire");
        int cond = Integer.parseInt(input.nextLine());
        while (cond != 0){
        switch (cond){
            case 1: {
                System.out.println("inserisci il nome da aggiungere");
                String name = input.nextLine();
                System.out.println("inserisci il numero da aggiungere");
                String cell = input.nextLine();
                Rubrica = addElem(Rubrica,name,cell);
                break;
            }
            case 2: {
                System.out.println("inserisci il nome da eliminare");
                String name = input.nextLine();
                Rubrica = removeElem(Rubrica,name);
                break;
            }
            case 3:{
                System.out.println("inserisci il numero da ricercare");
                String cell = input.nextLine();

            }
            case 4:{
                System.out.println("inserisci il nome da ricercare");
                String name = input.nextLine();
                searchName(Rubrica,name);
                break;
            }
            case 5:{
                System.out.println("rubrica stampata");
            }
        }
        }
    }
    static HashMap addElem(HashMap x,String name,String cell){
        x.put(name,cell);
        return x;
    }
    static HashMap removeElem(HashMap x,String name){
        x.remove(name);
        return x;
    }
    static void searchNumber(HashMap x,String cell){
        for (Object value: x.values()){
            if (value == cell) {
                System.out.println(x);
            }
        }
    }
    static void searchName(HashMap x,String name){
        System.out.println(x.get(name));
    }
}
