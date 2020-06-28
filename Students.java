public class Students{
        int phy=5;
        int chem=6;
        void display(){
            System.out.println("phy "+phy);
            System.out.println("chem "+chem);
        }
    }
class BioStudents extends Students{
       int bio=7;
       void displaybio(){
           System.out.println("bio "+bio);
        }
    }
