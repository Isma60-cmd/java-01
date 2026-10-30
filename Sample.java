import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
System.out.println("how many numbers do you want to enter");



int x = input.nextInt();   //allowing user to enter number
int[] numbers =new int[x];//

for(int i=0;i<x;i++){
    System.out.println("enter number " +(i+1) +"; ");
    numbers[i] = input.nextInt();
     

}
System.out.println("even numbers");
for(int i=0;i<x;i++){
    if (numbers[i]%2==0){
        
        System.out.println("index "+i+"; " + numbers[i]);}
    
else{
    System.out.println(numbers[i] +" is odd");
}}

int total=0;
for( int number :numbers)
    total+=number;
System.out.println("total " + total);

input.close();
}

    }
    

