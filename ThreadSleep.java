class First1 implements Runnable
{
Thread t;
First1()
{
t=new Thread(this,"NEW");
System.out.println("CHILD:"+t);;
t.start();
}
public void run(){
try{
    for(int i=5;i>0;i--)
    {
System.out.println("CHILD:"+i);
Thread.sleep(500);
}
}

catch(InterruptedException e){}
System.out.println("EXITING CHILD");
}


}

class ThreadSleep{
public static void main(String args[])
{
new First1();
try{
for(int i=5;i>0;i--)
{
System.out.println("MAIN:"+i);
Thread.sleep(1000);
}
}
catch(Exception e){}
System.out.println("EXISTING main");

}
}