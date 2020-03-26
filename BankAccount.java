public class BankAccount{
    String Name;
    String AccNo;
    String Type;
    Double Balance;
    
    BankAccount(String a, String b, String c){
        this.Name =a;
        this.AccNo = b;
        this.Type = c;
        this.Balance = 0.0;
    }
    void Deposit(double amount){
        this.Balance = this.Balance + amount;
    }
    void WithDraw(double amount){
        if(amount < this.Balance)
        {
            this.Balance = this.Balance - amount;
        }
        else
            System.out.println("Not enough balance");
    }
    void Display(){
        System.out.println("The name is " + this.Name + 
                            "the balance is " + this.Balance);
    }
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount("Ram","0000001","saving");
        acc1.Display();
    }
    
}
