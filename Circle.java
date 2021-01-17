import java.util.Scanner;
public class Circle{   
    int radius; //this   
    Circle(int radius){
        this.radius=radius;
    }
    
    double area(){
        return 3.14*radius*radius;
    }
    double perimeter(){
        return 2*3.14*radius;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius=sc.nextInt();
        Circle c=new Circle(radius);
        System.out.println("Area : "+c.area());
        System.out.print("Perimeter : "+c.perimeter());
        sc.close();
    }
}