package lesson1;

import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao a = : ");
        a = sc.nextInt();
        System.out.println("Nhap vao b = : ");
        b = sc.nextInt();
        System.out.println(a +" + " + b + " = " +(a + b));
        System.out.println(a +" - " + b + " = " +(a - b));
        System.out.printf("%d mod % d = %d\n",a,b,a%b);
        System.out.printf("%d x % d = %d",a,b,a*b);
//        System.out.println(a +" * " + b + " = " +(a * b));
//        System.out.println(a +" / " + b + " = " +(a / b));
//        System.out.println(a +" % " + b + " = " +(a % b));
    }
}
