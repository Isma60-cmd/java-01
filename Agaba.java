public class Agaba {
    //String firstname="Angel",lastname="Agaba",course="computer science";
public static void main(String[] args) {
      String firstname="Angel", lastname="Agaba",course="computer science";


      //DISPLAY STUDENTS FIRSTNAME LASTNAME AND COURSE
    System.out.println("first name is " + firstname);
 System.out.println("lastname is " + lastname);
 System.out.println("course: "+ course);

//DISPLAY FULLNAME BY COMBINING FIRSTNAME LASTNAME WITH +OPERATOR
 System.out.println("fullname: "  +firstname +" " +lastname );


 //DISPLAY SAME FULL NAME USING CONCAT ()METHOD
  System.out.println("full name using concat: "+ firstname.concat(" ").concat(lastname));


  //LENGTH OF FULLNAME USING length()
  String fullname=firstname+" "+lastname;
   System.out.println("name length:"+fullname.length());

   //first character of firstname using charAt()
    System.out.println("first character:" + firstname.charAt(0));

     
    //display fullname in uppercase and lowercase
    System.out.println("uppercase fullname; " +fullname.toUpperCase());

 System.out.println( "lowercase name; " +fullname.toLowerCase());

 //create sentence using variables

  System.out.println(firstname+ " " +lastname+ " " + "is studying" +" " +course);
}



}
