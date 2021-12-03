package lesson2;

import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        int a = 1, b = 0, c = 0;
        do {
            c = a + b;
            a = b;
            b = c;
            if (c < n)
                System.out.print(c + " , ");
        }while(c < n);
    }
}
