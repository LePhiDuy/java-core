package lesson2;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        int S = 0;
        double avg;
//        for (int i = 1; i <= n; i++)
//        {
//            S+=i;
//        }
//        avg = (double) S/n;
//        System.out.println("The sum of 1 to " + n + " is " + S);
//        System.out.println("The avarage is " + avg);
//        int i = 1;
//        while(i <= n)
//        {
//            S+=i;
//            i++;
//        }
//        avg = (double) S/n;
//        System.out.println("The sum of 1 to " + n + " is " + S);
//        System.out.println("The avarage is " + avg);
        int i = 1;
        do {
            S+=i;
            i++;
        }while(i <= n);
        avg = (double) S/n;
        System.out.println("The sum of 1 to " + n + " is " + S);
        System.out.println("The avarage is " + avg);
    }
}
