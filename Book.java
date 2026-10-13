public class Book{
    //private attributes of class book
      private  String title,author;
       private double price;

        
       //default constructor
       Book(){
        title="untitled";
        author="unkown";
        price=0.0;
       }

        //getters and setters
       public String getTitle(){
        return title;}
       public void setTitle(String title){
        this.title=title;
        }

         public String getAuthor(){
        return author;}
       public void setAuthor(){
        this.author=author;}

         public double getPrice(){
        return price;}
       public void setPrice(){
        this.price=price;}

        
        //parameterised constructor
        Book(String title,String author,double price){
            this.title=title;
            this.author=author;
            this.price=price;
        }
        
        //method
        public void displayinfo(){
            System.out.println("title of book is "+title);
            System.out.println("Authors name, "+author);
             System.out.println("price: "+price);
        }
        //method
        public double applyDiscount(double percent){
            return price*((100-percent)/100);
        }


    
    public static void main(String[] args) {
        Book book1=new Book();
        book1.displayinfo();

           Book book2=new Book("things fall apart","Chinua Achebe",5000.0);
           Book book3=new Book("ruins of a star","star",2000);
         book2.displayinfo();
           book3.displayinfo();
           book1.setTitle("advanced biology");
           System.out.println("new title: "+book1.getTitle());
           System.out.println("book2 after discount "+book2.applyDiscount(10));

           
    }

    }

