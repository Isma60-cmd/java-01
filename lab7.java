public class lab7 {
    

//accessible modifiers
public String university="makerere university";
private String name ;
private int age;
protected String programme="computer science";
String registrationstatus="registered";

//non accessible modifiers
static int studentsnumber=0;
final String studentnumber;

 lab7(String studentnumber,String name,int age){
    this.studentnumber=studentnumber;
    this.name =name;
    setAge(age);
   studentsnumber++;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;

}
public int getAge(){return age;}
public void setAge(int age){if(age>=0){this.age=age;
}else{System.out.println("invalid age");}
}
public String getStudentnumber(){
    return studentnumber;

}public void displaydetails(){
    System.out.println("Studentnumber "+studentnumber);
    System.out.println("name "+name);
    System.out.println("age "+age);
    System.out.println("programme "+programme);
    System.out.println("university "+university);
    System.out.println("registrationstatus "+registrationstatus);
}
public static void main(String[] args) {
    lab7 student1=new lab7("2600709865","Allan",23);
    System.out.println("STUDENT DETAILS");
    student1.displaydetails();

    System.out.println("private data through methods");
    System.out.println("name "+student1.getName());
System.out.println("age "+student1.getAge());


student1.setAge(-3);
System.out.println("result "+student1.getAge());


student1.name="peter";

lab7 student2=new lab7("2600704668","peter",34);
System.out.println("number of students "+lab7.studentsnumber);
}
}