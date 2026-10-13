import java.util.Scanner;
import java.util.Arrays;
public class Assignment2 {
 //factorial program
 /*public int factorial(int x){
    if(x>1)
    {
    return x* factorial(x-1);
 }else {return 1;}}
 public static void main(String[] args) {
    int y;
    Scanner input= new Scanner(System.in);
    IO.println("enter value");
     int x=input.nextInt();
    factorial(int x);
 */ 
public static void main(String[] args) {
    int[] numbers =new int[10];
    int i=9;
    
     Scanner input=new Scanner(System.in);
    for (i=0;i<10;i++)
{if (i==0)
{System.out.println("enter first number");
numbers[i]=input.nextInt();

}else{System.out.println("enter next number");
    numbers[i] =input.nextInt();
}

}
int sum=0;
for(int number: numbers){
    
    sum+=number;
    double average=sum/10;
    IO.println(sum);
}
int max =numbers[0];
for(int number :numbers){
    if (number>max){max = number;
       
    }
}
System.out.println("MAXIMUM VALUE "+max);
System.out.println("AVERAGE "+average);
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));



}
}
