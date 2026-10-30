import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int x=7;
        int guess;
        Scanner input= new Scanner(System.in);
    for(;;){
       System.out.println("guess the number");
       guess=input.nextInt();


        if(guess>x){
        System.out.println("too high! tryagain");
    }

    else if(guess<x){
        System.out.println("too low!try again");
    }

    else {System.out.println("correct you guessed it");  
        break;
    } //use a break  as an escape since an infinite for loop is used 




        }
    }
}
