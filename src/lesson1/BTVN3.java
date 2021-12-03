package lesson1;

import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("n = ");
//        int n = sc.nextInt();

        for(int i = 2; i <= 10; i++)
        {
            System.out.println("Bang cuu chuong " +i);
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
