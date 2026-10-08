
//3.1

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        
        int maths;
        int programming ;     //creating integer variables
        int biology;

        String grade;
        
       
        Scanner input= new Scanner(System.in);//import scanner class
        System.out.println("enter maths mark ");
        maths =  input.nextInt();//requesting marks
        
       System.out.println("enter programming mark"); 
        programming =  input.nextInt();
       
       
        System.out.println("enter biology mark");
         biology =  input.nextInt();

  if(maths<0|| maths>100){
    grade="invalid mark";
} 
else if(maths>=80){
    grade="A";
}
else if(maths>=75){
    grade="B+";
}
else if(maths>=70){
    grade="B";}

else if(maths>=65){grade="C+";}

else if(maths>=60){grade="C";}

else if(maths>=55){grade="D";}

else if(maths>=50){grade="E";}

else{grade="F";}
System.out.println("Your mark in maths is "+maths+"% which is an "+grade);//printing a meaningfull sentence


             if(programming<0|| programming>100){
    grade="invalid mark";
} 
else if(programming>=80){
    grade="A";
}
else if(programming>=75){
    grade="B+";
}
else if(programming>=70){
    grade="B";}

else if(programming>=65){grade="C+";}

else if(programming>=60){grade="C";}

else if(programming>=55){grade="D";}

else if(programming>=50){grade="E";}

else{grade="F";}
System.out.println("Your mark in programming is "+programming+"% which is an "+grade);
  



 if(biology<0|| biology>100){
    grade="invalid mark";
} 
else if(biology>=80){
    grade="A";
}
else if(biology>=75){
    grade="B+";
}
else if(biology>=70){
    grade="B";}

else if(biology>=65){grade="C+";}

else if(biology>=60){grade="C";}

else if(biology>=55){grade="D";}

else if(biology>=50){grade="E";}

else{grade="F";}
System.out.println("Your mark in biology is "+biology+"% which is an "+grade);






}}




    
        
    

