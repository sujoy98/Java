class text{
    void display(){
        System.out.println("super");
    }
}
class Myclass extends text{
    void display(){
        super.display();// this to display the method of the super class
        System.out.println("sub");
    }
}
public class Inheri{
public static void main(String[]args){
    Myclass obj=new Myclass();
    obj.display();    
    }
}
