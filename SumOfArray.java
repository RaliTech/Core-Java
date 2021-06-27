import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int i, n, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemetns ");
    int arr[]=new int [n];
    System.out.println("Enter the elements");
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
        sum=sum+arr[i];
    }
            System.out.println("Sum of all elements is= "+sum);
        
    }
    
}
