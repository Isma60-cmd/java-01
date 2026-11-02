public class Bankaccount {
    final String accountname="my account";
    private String accountnumber;
     double balance;
    Bankaccount(){}
     public Bankaccount(String accountnumber,double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;

    }
    public void setAccountnumber(String accountnumber){
        this.accountnumber=accountnumber;
    }
    public String getAccountnumber(){
        return accountnumber;
    }
    void deposit(double amount){
        balance+=amount;
        IO.println("new balance is "+balance);
     }
     void withdraw(double amount){
        balance-=amount;
        if(balance>=0){
        IO.println("new balance is "+balance);}
        else{IO.println("invalid reguest");}
     }
     double displaybalance(){
        return balance;
        
     }

}
class Accounts extends Bankaccount{
   Accounts (String accountnumber,double balance){

   }
     
public static void main(String[] args) {
   Accounts  A=new Accounts("34455667",200000.0);
   A.deposit(20000);
   A.withdraw(400000);
   A.displaybalance();
   IO.println(A.balance);
}}
