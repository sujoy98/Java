public class BinarySearch  {
	public static void main(String[]args) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int data=7;
		int first_index=0,last_index=ar.length-1;
		while(first_index<=last_index) {
			int mid=(first_index+last_index)/2;
			if(data==ar[mid]) {
				System.out.println("Number found");break;
			}else if(data<ar[mid]) {
				last_index=mid-1;
			}else {
				first_index=mid+1;
			}
		mid=(first_index+last_index)/2;
		if(data!=ar[mid]) {
			System.out.println("Not found");break;
			}
		}
	}
}
