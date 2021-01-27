class Overriding {
    void display() {
        System.out.println("Parent Class");
    }
}
class Over extends Overriding {
    @Override
    void display() {
        System.out.println("Child Class");
    }
}

public class Driver {
    public static void main(String[] args) {
        Over obj = new Over();
        obj.display();
    }
}