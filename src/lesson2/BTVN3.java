package lesson2;

import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        int S = 0, i = 0,x;
        while(n != 0)
        {
            x = n % 2;
            n = n/2;
            S += x*Math.pow(10,i);
            i++;
        }
        System.out.println(S);
    }
}
