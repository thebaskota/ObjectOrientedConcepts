public class Interest{
    static String Name = "Corona Bank";
    int principal,rate,time;
    Interest(int a, int b){
        this.principal = a;
        this.rate = b;
        this.time = 5;
        
    }
    void calculateInterest(){
        double Int = this.principal * this.rate *this.time / 100;
        System.out.println(" the interest is" + Int);
    }
    public static void main(String[] args)
    {
        Interest ram = new Interest(100000,10);
        Interest shyam = new Interest(5000,2);
        ram.calculateInterest();
        shyam.Name = "sunway";
        System.out.println(ram.Name);
        System.out.println(shyam.Name);
    }
}
