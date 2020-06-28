import java.util.Scanner;
class Arr3{
    //Insertion sort
    /*
     a[]={2,|||[4],5,6,3,4,67,8,9}
     array ittarating starts from a[i] that is 4 here and it changes with loop,
     we are considering the a[0] element as an sorted array so we start the loop from first index,
     selecting each a[i] at a time comparing with the sorted part and inserting in its position
     */
    void Sort(int a[]){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    //Binary Search <THE ARRAY NEEDS TO BE SORTED FOR IMPLEMENTING THIS ALGORITHM>
    /*
    l= First Index. r= Last Index, mid= (l+r)/2
     */
    int Search(int a[],int l,int r,int data){
        while(l<r){
            int mid=(l+r)/2;
            if(data==a[mid]){
                return mid;
                }else if(data<a[mid]){
                    r=mid-1;
                    }else{
                        l=mid+1;
                        }
            mid=(l+r)/2;
            if(data!=a[mid]){
                return -1;
            }
        }
        return 0;
     }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            System.out.println();
            System.out.println("Your ARRAY :-");
        for(int z=0;z<a.length;z++){
            System.out.print(a[z]+" ");
        }
            System.out.println();
            System.out.println("Enter a number to search : ");
            int data=sc.nextInt();
            Arr3 obj=new Arr3();
            obj.Sort(a);
            int result=obj.Search(a,0,a.length-1,data);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
    }
}

    
     
