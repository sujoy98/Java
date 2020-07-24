package linkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		MyLink l=new MyLink();
		boolean flag=true;
		while(flag) {
		System.out.println();
		System.out.println("1. Add last");
		System.out.println("2. Add first");
		System.out.println("3. View List");
		System.out.println("4. Exit");
		System.out.println("5. Add at pos");
		System.out.println("6. Delete first");
		System.out.println("7. Delete last");
		System.out.println("8. Delete at position");
		System.out.println("9. List size");
		System.out.println("Enter choice :-");
		int ch=sc.nextInt();
		int val,pos;
		switch(ch) {
			case 1: 
				System.out.println("Enter a value ");
				val=sc.nextInt();
				l.addAtLast(val);
				break;
			case 2:
				System.out.println("Enter a value ");
				val=sc.nextInt();
				l.addFirst(val);
				break;
			case 3:
				l.print();
				break;
			case 4:
				flag=false;
				System.out.println("EXIT");
				break;
			case 5:
				System.out.println("Enter value");
				val=sc.nextInt();
				System.out.println("Enter pos");
				pos=sc.nextInt();
				l.addAtPos(val, pos);
				break;
			case 6:
				l.deleteFirst();
				break;
			case 7:
				l.deleteLast();
				break;
			case 8:
				System.out.println("Enter position");
				pos=sc.nextInt();
				l.deleteAtPos(pos);
				break;
			case 9:
				l.Size();
				break;
			default :
				System.out.println("WRONG");
				break;
			}
		}
	sc.close();
	}
}
