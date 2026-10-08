//ENCAPSULATION
/*class bankaccount{
    private double balance;/*private introduces encapsulation, double means the amount in this variable is a decimal,
    balance is the variable name */
   /* public void deposit(double amount){//amount is a double
        balance += amount;//same as balance= balance + amount(which is the deposit)
    }
    public double getbalance(){//its a getter method
        return balance;


        
    }*/
/*public class test {


    public static void main(String[] args) {
     bankaccount acc =new bankaccount();
     acc.deposit(1000);
     System.out.println("balance "+acc.getbalance());
}
}*/   

//INHERITANCE
/*class animal{
    void eat(){ //void means method executed but returns nothing
        System.out.println("This animal eats food");
    }}*/
 /*class dog extends animal{//extends is inheritence keyword all features in animal are inherited
        void bark(){
 System.out.println("dog barks");
}   

}*/
/*public class test {

    public static void main(String[] args) {
        
    
        dog d =new dog();// d is a class dog object
        d.eat();
        d.bark();
    }
}*/



//ABSTRACTION
/*abstract class vehicle{
    abstract void start();

}*/
/*class car extends vehicle{
void start(){
        System.out.println("starts by inserting key");
}
}*/
/*class bike extends vehicle{
    void start(){
        System.out.println(" starts by pressing a button ");
    }
}*/
/*public class test {

    public static void main(String[] args) {
        vehicle  x = new car();
        vehicle y = new bike();
        x.start();
        y.start();
    }
}*/

 /*public class test {

/* 
    void main(){
IO.println("motherboard");
IO.println(Math.pow(2, 03));
    int x=25;*/
     
    /*boolean y=(x>15||x<15);
    IO.println(y);
IO.println((x>15||x<15));
String course ="scientific computing";*/



/*public class test {
   /*  void main(){
IO.print("\n assignment operators");
int  number =18;
number+= 5;
IO.println(number);
System.out.println(number);
int x=2,y=4;
System.out.println(x==4);

boolean hasid=true,regist=true;
System.out.println(hasid && regist);

double d=23;int p= (int)d;


System.out.println(d);

System.out.println("\"she said a got!\"");
System.out.println("first\fsecond");



 
}

    
}*/
/*import java.util.Arrays;
import java.util.Scanner;*/

/*public class test {

    void main(){
Scanner input =new Scanner(System.in);

System.out.println("numbers from 1-3");
int num = input.nextInt();
switch (num) {
    case 1:
    System.out.println("you chose one");
        
        break;

    default:System.out.println("invalid input");
        break;



}


int numbers[]={1,23,443,43,3};
IO.println(numbers[4]);
Arrays.sort(numbers);
System.out.println(numbers.length);
System.out.println(Arrays.toString(numbers));
int[]numbers = input.length();


input.close();
}


    
}*/

import java.util.Scanner;

public class tes{
static void welcome( int age){
    IO.println("welcome entered age");
    
if (age<6){ 
    IO.println("you young person");
}else{
    IO.println("you can access");
}}
 public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
  int age =input.nextInt();
    welcome(age);

input.close();
 }
}


