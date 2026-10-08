import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        int x=7;
        int guess;
Scanner input=new Scanner(System.in);
do{
    System.out.println("guess the number");
guess=input.nextInt();
 if(guess>x){
        System.out.println("too high! tryagain");
    }

    else if(guess<x){
        System.out.println("too low!try again");
    }
    else {System.out.println("correct you guessed it");}

}while(guess!=x);


    }
    
}
