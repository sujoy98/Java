class Student {
    private int rollNum;
    private String name;

    void setData(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    int getData() {
        return rollNum;
    }

    String getName() {
        return name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setData(5, "Sujoy");
        System.out.println(s.getData());
        System.out.println(s.getName());
    }
}
