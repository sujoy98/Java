package demo;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		MyLink l=new MyLink();
		boolean flag=true;
		while(flag) {
		System.out.println();
		System.out.println("1. Add at last position in the list");
		System.out.println("2. Add at first position in the list");
		System.out.println("3. Add at desired position in the list");				
		System.out.println("4. Delete first element from the list");
		System.out.println("5. Delete last element from the list");
		System.out.println("6. Delete at desired position in the list");
		System.out.println("7. View the created List");
		System.out.println("8. Exit");
		System.out.println("9. View the size of created list");
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
				System.out.println("Enter value");
				val=sc.nextInt();
				System.out.println("Enter pos");
				pos=sc.nextInt();
				l.addAtPos(val, pos);
				break;
			case 4:
				l.deleteFirst();
				break;
			case 5:
				l.deleteLast();
				break;
			case 6:
				System.out.println("Enter position");
				pos=sc.nextInt();
				l.deleteAtPos(pos);
				break;
			case 7:
				l.print();
				break;
			case 8:
				flag=false;
				System.out.println("EXIT");
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
