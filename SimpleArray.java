public class SimpleArray {
    public static void main(String[] args) {
        int arr[]=new int []{1,2,3,4,5,6};
        int arrc[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            arrc[i]=arr[i];
        }
        //Displaying the first array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println( );
        //Displaying the copy array
        System.out.println("After copy the elements :");
        for(int i=0;i<arrc.length;i++){
            System.out.println(arrc[i]+ " ");
        }
       

    }
    
}
