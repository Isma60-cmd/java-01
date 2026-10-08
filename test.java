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

public class test{ 
//logic between watsapp
    public static void main(String[] args) {
        System.out.println("hello everyone");
        String myname ="isma";
        String friend="Alex";
        int unreadmessages=3;

        System.out.println("logged in " +myname);
        System.out.println("logged in " +friend);

        boolean isonline =true;
        boolean isblocked=false;
        boolean hasinternet=true;
        boolean readit=false;
        System.out.println("online" +isonline);

        unreadmessages=3;
        System.out.println(unreadmessages==3);

        int groupmakers=150;
        int maxgroupsize=1024;
        boolean groupmember=groupmakers<maxgroupsize;
        System.out.println("can you add new group member "+groupmember);

        boolean cansendmessage= hasinternet&&!isblocked;
        System.out.println("can i send message "+cansendmessage);
        System.out.println("is alex offline "+!isonline);

        int newmessage=150;
        int shownonbadge=Math.min(newmessage,99);
        System.out.println("badge shows "+shownonbadge+"+");

        double voicenoteseconds=47.5;
        long shownseconds=Math.round(voicenoteseconds);
        System.out.println("voice note length is "+shownseconds);

        if(isonline){
            System.out.println( friend +" is online");
        }
        if(unreadmessages>0){
            System.out.println("you have "+unreadmessages +" unread messages");
        }

        String message= "hi Alex ";
        if(cansendmessage){
            System.out.println("you : "+ message);}

            else{System.out.println("clock icon message not sent");

            }


        if(cansendmessage){
            System.out.println("one gery tick");
            if(isonline){
                System.out.println("two grey ticks");
            }else{
                System.out.println("one grey tick");
            }
        }else{
            System.out.println("no tick");
        }    
     }
        
 } 


