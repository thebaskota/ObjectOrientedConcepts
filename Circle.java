public class Circle{
    int radius;
    Circle(int r){
        this.radius =r;
    }
    Circle(){
        this.radius = 5;
    }
    public static void main(String[] args)
    {
        Circle cir1 = new Circle(4);
        Circle cir2 = new Circle();
        System.out.println(cir1.radius);
        System.out.println(cir2.radius);
        Dimension cube = new Dimension(5);
        System.out.println(cube.getlength());
        cube.setlength(12);
        System.out.println(cube.getlength());
    }
    
}
