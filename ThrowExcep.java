public class ThrowExcep {
    public static void main(String[] args) {
        int age=15;
        try {
            if(age<18) {
                // throw new ArithmeticException("Age less than 18");
                throw new NotAnAdult();
            }
        } catch(NotAnAdult e) {
            System.out.println(e);
        }
    }
}
