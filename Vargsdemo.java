class Vargs{
    //using varargs ...
    public int add(int ... n){//values from object of add method will be accpted as an array for vargs ...
        int sum=0;
        // normal for loop not working,so using enhanced for loop in case of array in varargs
        for(int i:n){
            sum+=i;
        }
            return sum;
    }
}
public class Vargsdemo{
    public static void main(String[]args){
        Vargs obj=new Vargs();
        int result=obj.add(1,1,1,1);// passing multiple values for the operation
        System.out.println(result);
    }
}