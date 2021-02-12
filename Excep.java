public class Excep {
    public static void main(String[] args) {
        int a=10;int b=0;
        int ar[]=new int[2];
        try {
            ar[1]=4;
            try {
                System.out.println(a/b);
            } catch(ArithmeticException e) {
                // System.out.println("Divide by zero error");
                // b=5;
                // System.out.println(a/b);
                System.out.println(e);
            } 
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("from finally block");
        }
    }
}
