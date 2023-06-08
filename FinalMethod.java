 class Bus {
     

    final void run()   // final keyword can be inherited

    {
        System.out.println("running ...");
    }

}

    
 class FinalMethod extends Bus
 {
    
    public static void main(String[] args) 
    {
        FinalMethod fm = new FinalMethod();
        fm.run();
        
    }
        

}

    

