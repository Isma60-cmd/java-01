public class Exercise5_1 {

//CREATING OVERLOADED METHODS NAMED  calculateShippingcost


  //   VERSION 1 ,TAKES ONLY WEIGHT AS INPUT
public static double calculateshippingcost( double weight){
        return weight*200;              
 } 

 // VERSION 2 ,TAKES BOTH WEIGHT AND DESTINATION AS INPUTS
 public static double calculateshippingcost(double weight, String destination){
    if (destination=="germany"){return weight*500;}
    else{return weight*200;}           //version2
 }

 // VERSION 3 TAKES WEIGHT AND NUMBER OF ITEMS AS INPUTS
  public static double calculateshippingcost(double weight,int numberofitems){
    return (weight*numberofitems)*200;
  }                                  //version3

public static void main(String[] args) {
  double  cost1=calculateshippingcost(45.5);//version 1 is called since only weight is used



double cost2=calculateshippingcost(45.5,"germany");
double cost3=calculateshippingcost(45.5,"africa");//version 2 is used since weight and destination are used


double cost4=calculateshippingcost(45.5,456);//version3 is used ,weight and number of items are used

System.out.println("cost1: " +cost1);
System.out.println("cost2: "+ cost2);
System.out.println("cost3: "+cost3);
System.out.println("cost4:"+ cost4);

}

}
