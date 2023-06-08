 class Address {
    String city,state,country;

    public  Address(String city,String state,String country)
    {
        this.city=city;
        this.state = state;
        this.country=country;

    }
    
} 

class Emp
{
    int id;
    String name;
    Address address;//Address class
    public  Emp(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;

       
    }
    void display()
    {
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);

    }
    


}

public class EmpAddress {

    public static void main(String[] args) 
    {
        Address ads1 = new Address("palamaner","Ap","India");
        Address ads2 = new Address("Chittoor","Ap","India");

        Emp e1 = new Emp(111,"Mounish",ads1);
        Emp e2 = new Emp(222,"Astha",ads2);

        e1.display();
        e2.display();

    }


    
}
