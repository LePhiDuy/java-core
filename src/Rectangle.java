package lesson5;

public class Rectangle {
        int weight;
        int length;
        public Rectangle()
        {
            weight = length = 0;
        }
        public Rectangle(int w, int l)
        {
            weight = w;
            length = l;
        }
        public void setWeight(int w)
        {
            weight = w;
        }
        public void setLength(int l)
        {
            length = l;
        }
        public int getWeight()
        {
            return weight;
        }
        public int getLength()
        {
            return length;
        }
        public int CV()
        {
            return (weight + length) * 2;
        }
        public int S()
        {
            return weight * length;
        }
        public boolean isSquare()
        {
            return (weight == length);
        }
        public void Display()
        {
            System.out.println("chieu rong = " + weight);
            System.out.println("chieu dai = " + length);
        }
};

