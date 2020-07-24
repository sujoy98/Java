package linkedList;

public class MyLink {
	int size;
	Node head;
	MyLink(){
		size=0;
		head=null;
	}
	void addFirst(int data) {
		Node n=new Node(data);
		if(isEmpty()) {
			head=n;
			return;
		}else {
			n.next=head;
			head=n;
		}
		size++;
	}
	void addAtLast(int data) {
		Node n=new Node(data);
		if(isEmpty()) {
			head=n;
		}else {
			Node temp=head;
			while(temp.next !=null) {
				temp=temp.next;
			}		
			temp.next=n;
		}
		size++;
	}
	void addAtPos(int data,int pos) {
		if(pos==1) {
			addFirst(data);
		}else if(pos==size+1) {
			addAtLast(data);
		}else if(pos > 1 && pos <= size ) {
			Node n=new Node(data);
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
			size++;
		}
	}
	void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}else{
			head=head.next;
			size--;
		}
	}
	void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			Node temp=head;
			for(int i=1;i<size-1;i++) {
				temp=temp.next;
			}
			temp.next=null;
			size--;
		}
	}
	/*
	 * after for loop temp has the address of 3, which is in the second node, now to
	 * find the address of 4th node we need another Node type variable temp1, temp1=temp.next>address of 3
	 * temp1.next>address of 4.  
	 */
	void deleteAtPos(int pos) {
		if(pos==1) {
			deleteFirst();
		}else if(pos==size){
			deleteLast();
		}else if(pos<1||size<pos) {
			System.out.println("Invalid Position");
		}else {
			Node temp=head;
			Node temp1;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			temp1=temp.next; // temp1=temp.next.next > address od 4 directly
			temp.next=temp1.next;
			size--;
		}
	}
	int getListSize() {
		return size;
	}
	void Size() {
		System.out.println(size);
	}
	void print() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	} 
	boolean isEmpty() {
		return head==null;
	}
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
}

