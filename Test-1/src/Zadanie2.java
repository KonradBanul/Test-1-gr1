import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tab = new int[n];
        losuj(tab,-50,50);
        pisz(tab);
        najmniejszy(tab);
    }
    public static void losuj(int[] tab, int min, int max) {
        Random r = new Random();
        int i;
        for (i = 0; i < tab.length; ++i) {
            tab[i] = r.nextInt(min, max);
        }
    }
    public static void pisz(int[] tab) {
        int i;
        for(i=0;i<tab.length;i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void najmniejszy(int[] tab) {
        int i, min, ile=0;
        min = tab[0];
        for(i=0;i<tab.length;i++) {
            if(min>tab[i]) {
                min = tab[i];
            }
        }
        for(i=0;i<tab.length;i++) {
            if(tab[i]==min) {
                ile++;
            }
        }
        System.out.println(" ");
        System.out.print("Najmniejszy element to: ");
        System.out.println(min);
        System.out.print("Ilość występowania: ");
        System.out.println(ile);
    }
}

