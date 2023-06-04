 class Sample1 {

        int rollno;
        String name;
    
        void insertrecord(int a,String b)
    
        {
            rollno =a;
            name =b;
    
        }
    
        void display()
        {
            System.out.println("Roll no : "+rollno);
            System.out.println("Name : "+name);
        }
    }

     class SampleClassMethod
      {
        public static void main(String[] args)
        {
            Sample1 std = new Sample1();

            Sample1 std1; // it creates stack memory

            std1 = new Sample1(); //it creates heap memory
    
            std .insertrecord(100,"v mounish");
            
            std.display();

            std .insertrecord(101," jagadhesh");
            
            std.display();
    
    
    
        }
    
        
    }
    
    

