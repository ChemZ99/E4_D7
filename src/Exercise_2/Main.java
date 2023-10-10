package Exercise_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Integer> orderedList = new ArrayList<>();
        ArrayList<Integer> reversedList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int n1 = Integer.parseInt(input.nextLine());
        populateList(intList,n1);
        System.out.println("lista appena creata");
        for (int i=0; i<intList.size();i++) {
            int elem = intList.get(i);
            System.out.println(elem);
        }
        System.out.println("lista ordinata");
        orderedList=orderedList(intList);
        for (int i=0; i<orderedList.size();i++) {
            int elem = orderedList.get(i);
            System.out.println(elem);
        }
        System.out.println("lista capovolta");
        reversedList=reverseList(intList);
        for (int i=0; i<reversedList.size();i++) {
            int elem = reversedList.get(i);
            System.out.println(elem);
        }
    }
    static void populateList(ArrayList x, int n) {
        for (int i=0;i<n;i++) {
            x.add((int) (Math.random()*100));
        }
    }
    static ArrayList orderedList(ArrayList x){
        Collections.sort(x);
        return x;
    }
    static ArrayList reverseList(ArrayList x){
        Collections.sort(x);
        Collections.reverse(x);
        return x;
    }
}
