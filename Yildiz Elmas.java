

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int a=inp.nextInt();
        int b=(a-1),initial=1;
        
        for(int d=1;d<=(a*2-1);d++) { 
            for (int i = 1; i <= b; i++) {
                System.out.print(" ");
            }

            for(int stars=1;stars<=initial;stars++){
                System.out.print("*");
            }
            if(d<a) {
                initial = d * 2 + 1;
                b--;
            }
            else {
                initial -= 2;
                b++;
            }

            System.out.println();
        }
    }
}