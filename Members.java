class Emp{
    int eid;
    int salary;
    static String ceo;

    public void show(){
        System.out.println("Eid: "+eid+" Salary: Rs "+salary+" CEO: "+ceo);
    }
}

public class Members{
    public static void main(String[]args){
        Emp rahul=new Emp();
        rahul.eid=112434;
        rahul.salary=2000;
        rahul.ceo="Mahesh";

        Emp navin=new Emp();
        navin.eid=114534;
        navin.salary=5000;
        navin.ceo="Mahesh";

        //rahul.ceo="CHANGED FOR STATIC VARIABLE";
        //navin.ceo="CHANGED FOR STATIC VARIABLE";
        rahul.show();
        navin.show();
    }
}
