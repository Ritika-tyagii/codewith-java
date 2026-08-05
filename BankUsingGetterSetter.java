package OopsConcept;
 class Bank{
    private long  accountNumber;
    private int amount;

public long getaccountNumber(){
    return accountNumber;
}
public void setaccountNumber(long accountNumber){
    this.accountNumber=accountNumber;
}
public void display(){
    System.out.println("AccountNumber= "+accountNumber);
}
public  int getamount(){
  
     return amount;
}
public void setamount(int amount){
    if (amount<0){
        System.out.println("Invalid Amount");
    }
    this.amount=amount;
}
public void Withrow(int amount){
    System.out.println(amount +" =withdrow");
}
public void deposit( int amount){
System.out.println(amount+" =depsoit");
}
 }
public class BankUsingGetterSetter {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setaccountNumber(012455555);
        b1.Withrow(200);
        b1.deposit(500);
        b1.display();
    }
}
