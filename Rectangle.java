import java.util.Scanner;

public class Rectangle {
    double width,height;
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }
    public double getArea(double width,double height){
        return width*height;
    
        }    public double getPerimeter(double width,double height){
            return (2*(width+height));
        }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many rectangles do you want to enter");
        int x=input.nextInt();
        double  largestarea=-1;
        int largestrectangle =0;
        for(int i=0;i<x;i++){
            System.out.println("enter width");
            double width=input.nextDouble();
            System.out.println("enter height");
            double height=input.nextDouble();
            Rectangle rectangle =new Rectangle( width, height);
            double area=rectangle.getArea(width,height);
            double perimeter=rectangle.getPerimeter(width,height);
            System.out.println("rectangle "+i+" area: "+area);
            System.out.println("rectangle "+i+" perimeter "+perimeter);

            if(area>largestarea){
                largestarea=area;
                largestrectangle=i;}
                if(x>0){
                    System.out.println("rectangle "+largestrectangle+" is largest with area " +largestarea);               }
            
            




           
               
        }

    } 
}
