 class Point {

    double x;
    double y;

    public void setX(double x_value)
    {
        x=x_value;
    } 
    public void setY(double y_value)
    {
        y=y_value;

    }
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double Square_distance_from_origin()
    {
        return x*x+y*y;
    }


    
}

class ClassPoint
{
    public static void main(String[] args)

    {
        Point p = new Point();

        p.setX(12);
        p.setY(13);

        //p.getX();
        //p.getY();

       System.out.println(p.Square_distance_from_origin()); 
    


    }
}
