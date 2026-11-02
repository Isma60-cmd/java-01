public class Exercise6_1 {
    static class Book{
      private  String title,author;
       private double price;

       public String getTitle(){
        return title;}
       public void setTitle(){
        title="untitled";}

         public String getAuthor(){
        return author;}
       public void setAuthor(){
        author="unkown";}

         public double getPrice(){
        return price;}
       public void setPrice(){
        price=0.0;}
        Book(){}

        Book(String title,String author,double price){
            this.title=title;
            this.author=author;
            this.price=price;
        }
        public void displayinfo(){
            System.out.println("title of book is "+title);
            System.out.println("Authors name, "+author);
             System.out.println("price: "+price);
        }
        public double applyDiscount(double percent){
            return price*((100-percent)/100);
        }


    
    public static void main(String[] args) {
        Book book1=new Book();

        //deffault values without instanciating
         System.out.println(book1.getTitle());
          System.out.println(book1.getAuthor() );
           System.out.println(book1.getPrice());

           
           
           Book book2=new Book("things fall apart","Chinua Achebe",5000.0);
           Book book3=new Book("ruins of a star","star",2000);
           book2.displayinfo();
           book3.displayinfo();
           
           book1.applyDiscount(10);
           
    }

    }}

