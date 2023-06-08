class Square {

    int square(int n)
    {
        return n*n;
    }
    
}

class Circle
{
    Square sq; // aggregation

    double pi =3.14;
    double area(int radius)
    {
        sq = new Square();
        int rsquare = sq.square(radius); // code reuseablity

        return pi*rsquare;
    }
    public static void main(String[] args) {
        Circle  c = new Circle();
        double result =c.area(5);
        System.out.println(result);

    }


}
