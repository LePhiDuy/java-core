package lesson1;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        int nn = n*10 + n;
        int nnn = n*100 + n*10 + n;
        System.out.println(n + nn + nnn);
    }
}
