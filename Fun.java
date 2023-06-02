class A
{
public void funA1()
{
 System.out.println("This is from funA1");
}
public void funA2()
{
System.out.println("This is from funA2");
}
}

class B
{
public static void main(String[] args)
{
 A ref = new A();
 ref.funA1();
 ref.funA2();
}
}