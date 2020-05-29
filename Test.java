public class Test{
        static int sum(int a, int b){
        int sum;
        sum=a+b;
        System.out.println("Sum is : "+sum);
        return 0;
    }
    public static void main(String[]args){
        Test obj=new Test();// creating object of class Test
        obj.sum(5,5);
    }
}
