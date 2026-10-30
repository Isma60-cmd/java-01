import java.util.Scanner;





//use recursive method countdown()to display number of days remaining forr assignment
public class Exercise5_2{
    
    
public static void countdown( int days){// assigned prameter of method as an interger days
     if( days==0){
    System.out.println ("deadline is today");

}else{System.out.println (days+" days remaining");
 countdown(days-1);}

} 




public static void main(){
    int days;
    Scanner input =new Scanner(System.in);
System.out.println("enter remaining days due for assignment");
  days=input.nextInt();
countdown( days);

input.close();
}



}