package lesson5;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,10);
        rec.setWeight(5);
        rec.setLength(10);
        rec.Display();
        System.out.println("Chieu dai cua hinh chu nhat la: " +rec.getLength());
        System.out.println("Chu vi hinh chu nhat la: " + rec.CV());
        System.out.println("Dien tich hinh chu nhat la " + rec.S());
        if(rec.isSquare())
        {
            System.out.println("Day la hinh vuong");
        }
        else
        {
            System.out.println("Day khong phai la hinh vuong");
        }
    }

}
