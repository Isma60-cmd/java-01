import java.util.Scanner;

public  class Exercise3_2  {
    void main(){


double num1,num2;//name doubles
     Scanner input =new Scanner(System.in);//importing scanner
    
    //request numbers
     System.out.println("enter num1 " );
     num1 =input.nextDouble();
     
     
    System.out.println("enter num2 "); 
     num2 =input.nextDouble();



     char operator  ;
     System.out.println("enter operator(+,-,/,*)");
operator= input.next().charAt(0);

switch (operator) {
    case '+': System.out.println("result (num1 + num2)= " + (num1+num2));
         break;
     
    case '-':  System.out.println("result (num1 - num2)= " + (num1-num2));
         break;

    case '*':System.out.println("result (num1 * num2)= " + (num1*num2));
         break;

    case '/': System.out.println("result (num1 / num2)= " + (num1/num2));
         break;
         
         
    default: System.out.println("invalid operation");
        break;
}
     
     input.close();






    }
}
