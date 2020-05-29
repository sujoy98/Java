/*
this code is just to understand the working of a constructor that if we pass 1 parameter it will call the constructor
which is taking input of 1 variable, 2 parameter to 2 variablen and so on,and if we dont pass anythong it will call
the default constructor
*/
class C{
    int num1,num2;
    String operation;
    public C(){
        num1=0;
        num2=0;
        operation="abc";
    }
    public C(int i){
        num1=i;
        num2=0;
        operation="abc";
    }
    public C(int i,int j){
        num1=i;
        num2=j;
        operation="abc";
    }
    public C(int i,int j,String op){
        num1=i;
        num2=j;
        operation=op;
    }
}
public class ConsOver{
    public static void main(String[]args){
        C obj=new C();
        C obj1=new C(1);
        C obj2=new C(1,2);
        C obj3=new C(1,2,"xyz");
        System.out.println(obj3.operation);
    }
}

