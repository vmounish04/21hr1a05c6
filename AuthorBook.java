class Author
{
    String authorname;
    int age;
    String place;
    //Author class constructor 
    Author(String name,int age,String place)
    {
        this.authorname=name;
        this.age=age;
        this.place=place;

    }
}

class AuthorBook
{
    String name;
    int price;

    Author author;
    AuthorBook(String n,int p,Author author)
    {
        this.name=n;
        this.price=p;
        this.author=author;

    }

    public static void main(String[] args)
    {
        Author auth = new Author("mounish",19,"Chittoor");
        AuthorBook ab = new AuthorBook("java for begginer",800,auth);

        System.out.println("Book name :"+ab.name);
        System.out.println("Book price :"+ab.price);
        System.out.println("---------- Author Details ----------");
        System.out.println("Author name :"+ab.author.authorname);
        System.out.println("Auther Age :"+ab.author.age);
        System.out.println("Auther place :"+auth.place);

    }

}

