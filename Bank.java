import java.util.Scanner;
class bank{
    public void termDeposit(){
        System.out.println("-----TERM-DEOISIT-----");
        System.out.println();
        int principle;
        double rate,years;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        principle = sc.nextInt();
        System.out.print("Enter rate od interest : ");
        rate = sc.nextDouble();
        System.out.print("Enter time period in years : ");
        years = sc.nextDouble();
        double maturityAmount = (principle*(Math.pow(1+(rate/100),years)));
        System.out.println("Maturity Amount after " +years+ " years is : "+maturityAmount);
    }
    public void reccuringDeposit(){
        System.out.println("-----RECCURING-DEPOSIT-----");
        System.out.println();
        int monthlyInstallmentPayment,months;
        double rate;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Monthly payment : ");
        monthlyInstallmentPayment=sc.nextInt();
        System.out.print("Enter Number of months : ");
        months=sc.nextInt();
        System.out.print("Enter rate of interest : ");
        rate=sc.nextDouble();
        double maturityAmount = ((monthlyInstallmentPayment*months)+(monthlyInstallmentPayment*(months*((months+1)/100)))*(rate/100)*(1/12));
        System.out.println("Maturity Amount after " +months+ " months is : " +maturityAmount);
    }
}
public class Bank extends bank{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("--: E N T E R  Y O U R  C H O I S E :--");
            System.out.println();
            System.out.println("Press 1 : Term Deposit. ");
            System.out.println("Press 2 : Reccuring Deposit. ");
            System.out.println("Press 3 : Exit. ");

            ch=sc.nextInt();
        switch(ch){
            case 1:
                Bank obj=new Bank();
                obj.termDeposit();
                System.out.println();
                System.out.println("----------------THANK-YOU-------------------");
                System.out.println();
                break;

            case 2:
                Bank obj1=new Bank();
                obj1.reccuringDeposit();
                System.out.println();
                System.out.println("------------ ----THANK-YOU-------------------");
                System.out.println();
                break;

            case 3:
                System.out.println("-----GOOD-BYE-----");
                break;

            default :
                System.out.println("WRONG CHOISE");
        }
    }while(ch!=3);
}

}
