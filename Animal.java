import java.util.Scanner;
public class Animal{
    String Name;
    int nooflegs;
    
    Animal(){
        this.nooflegs = 4;
    }
    Animal(int a){
        this.nooflegs = a;
    }
    void walk(){
        System.out.println("i'm walking");
        //1000s of line
    }
    void eat(){
        System.out.println("i'm walking");

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Animal dog = new Animal();
        dog.Name = "richie";
        dog.walk();
        Animal cat = new Animal();
        cat.Name = "tommy";
        Animal bat = new Animal(2);
        bat.Name = "bruce";
        System.out.println(dog.nooflegs);
        System.out.println(bat.nooflegs);
    }
}
