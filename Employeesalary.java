public class Employeesalary {
    String name,ID;
    double basicsalary,allowance;
    Employeesalary(String name,String ID,double basicsalary,double allowance){
        this.name=name;
        this.ID=ID;
        this.basicsalary=basicsalary;
        this.allowance=allowance;

    }
     void dispaydetails(){
        IO.println("name "+name);
        IO.println("ID "+ID);
        IO.println("basicsalary; "+basicsalary +"and allowance "+allowance);


    }
    
public double totalsalary(){
double totalsalary=basicsalary+allowance;
return totalsalary;
} 
    
}
class Employees {
    public static void main(String[] args) {
        Employeesalary a=new Employeesalary("micheal's salary","234t84t0t24",7843467,500000);
        IO.println(a.totalsalary());
    }
}

