class Rectangle{
    int length;
    int width;

    void insert(int a,int b)
    {
        length =a;
        width =b;

    }

    void area()
    {
        System.out.println("Area of Rectangle is "+length*width);
    }
}

public class RectangaleArea {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(),rec1 = new Rectangle();  // creating two objects by using ',' opreater
        

        rec.insert(11,5);
        rec.area();
        rec1.insert(3,15);
        rec1.area();

        
    }
    
}
