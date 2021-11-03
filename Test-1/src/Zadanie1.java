import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int[] list = new int[n];
        for(i=0;i<list.length;i++) {
            list[i] = in.nextInt();
        }
        findPrimes(list);
    }
    public static void findPrimes(int[] list) {
        int ile=0,j,i;
        for(i=0;i<list.length;i++) {
            for (j = 2; j < list.length/2; j++) {
                if (list[i] % j == 0) {
                    ile++;
                }
            }
        }
        for(i=0;i<list.length;i++) {
            if(ile==2) {
                System.out.println(list[i]);
            }
        }
    }

}
