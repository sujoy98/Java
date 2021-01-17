import java.util.Scanner;
class movieMagic{
    int year;
    String title;
    float rating;
    public movieMagic(){
        year=0;
        title="";
        rating=0.0f;
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Movie Title : ");
        title=sc.nextLine();
        System.out.print("Enter Movie Year : ");
        year=sc.nextInt();
        System.out.print("Enter Movie Rating : ");
        rating=sc.nextFloat();
        sc.close();
    }
    public void display(){
        System.out.println("The Title of the Movie is "+title);
        if(rating>=0.0 && rating<=2.0){
            System.out.print("Flop");
        }
        else if(rating>=2.1 && rating<=3.4){
            System.out.print("Semi-hit");
        }
        else if(rating>=3.5 && rating<=4.5){
            System.out.print("Hit");
        }
        else if(rating>4.6 && rating<=5.0){
            System.out.print("Super-hit");
        }
    }
}
public class MovieMagic{
public static void main(String[]args){
    movieMagic obj=new movieMagic();
    obj.accept();
    obj.display();
}
}
