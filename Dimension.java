public class Dimension{
    private double length,width,height;
    
    Dimension(double length, double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    Dimension(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }
    public double getlength(){
        return this.length;
    }
    public void setlength(double a){
        this.length = a;
    }
    public double volume(){
        double vol;
        vol = this.length * this.width * this.height;
        return vol;
    }
    private double facearea(){
        return this.length*this.height;
    }
    private double sidearea(){
        return this.height*this.width;
    }
    private double toparea(){
        return this.width * this.length;
    }
    public double area(){
        double area;
        area = 2 * (facearea() + sidearea() + toparea());
        return area;
    }
    
    public static void main(String[] args)
    {
        Dimension cuboid = new Dimension(4.5,5,9.2);
        System.out.println(cuboid.length);
        System.out.println(cuboid.volume());
        System.out.println(cuboid.area());
    }
}
