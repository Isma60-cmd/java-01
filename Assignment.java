import java.util.Scanner;

public class Assignment {
    

    //ASSIGNMENTR 1
     /*  String name;
        int age;
        String course,registrationnumber;

        Assignment(String name,String course,String registrationnumber,int age){ 
            this.name=name;
            this.course=course;
            this.registrationnumber=registrationnumber;
            this.age=age;
        }
        void display(){
            System.out.println("studentname "+name);
             System.out.println("course "+course); 
             System.out.println("registrationnumber "+registrationnumber);
              System.out.println("age "+age);
        }
public static void main(String[] args) {
    Assignment s= new Assignment("isma","computer science","26/U/03639/PSA",20);
    s.display();
}
*/


//ASSIGNMENT 2

/*public static void calculator(double x,double y){ 
System.out.println("addition; "+(x+y));
System.out.println("multiplication; "+(x*y));
System.out.println("subtraction; "+(x-y));
System.out.println("modulus; "+(x%y));
}
public static void main(String[] args) {
    double x;
    double y;
    Scanner input =new Scanner(System.in);
     System.out.println("enter x");
     x=input.nextDouble();
      System.out.println("enter y");
      y=input.nextDouble();
calculator(x, y);
     input.close();

      

}*/



//ASSIGNMENT 3
public static void main(String[] args) {
    

int i, maths,bio,phy,chem,geog;

Scanner input=new Scanner(System.in);
System.out.println("enter following marks");

    System.out.println("bio mark");
    bio=input.nextInt();
    System.out.println("maths mark");
    maths=input.nextInt();
    System.out.println("phy mark");
    phy=input.nextInt();
    System.out.println("chem mark");
    chem=input.nextInt();
    System.out.println("geog mark");
    geog=input.nextInt();
int total=(bio+maths+chem+geog+phy);System.out.println("total "+total);
double average=total/5; System.out.println("average "+average);
int[] marks={bio,maths,phy,chem,geog};
char grade;
for(int mark:marks){
if(mark>80)
    grade='A';
    
    else if(mark>70){
        grade='B';
         System.out.println(mark+ grade); }
    
    else if(mark>60){
       grade='C';
     System.out.println(mark+ grade); }

       else if(mark>50) {grade='D'; }
       else{grade='F';
   System.out.println(mark+ grade); }

}}




//ASSIGNMENT 4
/*public static void main(String[] args) {
Scanner input=new Scanner(System.in);
    System.out.println("enter an integer");
int x=input.nextInt();
if(x%2==0){ System.out.println("its an even number");}
else{ System.out.println("its an odd number");}


}*/



/*public static void main(String[] args) {
    System.out.println("multiplication table of a number");
    Scanner input=new Scanner(System.in);
    System.out.println("enter a number");
int number=input.nextInt();
for(int i=1;i<13;i++){
    System.out.println(number+"*"+i+"= "+(number*i));
}


}*/

/*public int factorial(int x){
    if(n>1){
    return x*factorial(x-1);}
else return 1
}

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
System.out.println("enter positive integer");
int y=input.nextInt();
factorial(int y);

}*/

}

