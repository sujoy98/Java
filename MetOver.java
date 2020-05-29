class C{
    public void add(int i, int j){
        int sum=i+j;
        System.out.println("Sum is "+sum);
    }
    public void add(int i, int j, int k){
        int sum=i+j+k;
        System.out.println("Sum is "+sum);
    }
    public void add(double i, double j){
        double sum=i+j;
        System.out.println("Sum is "+sum);
    }
}

public class MetOver{
    public static void main(String[]args){
        C obj=new C();
        obj.add(5,2);
        obj.add(5,6,1);
        obj.add(5.5,5.5);
    }
}
