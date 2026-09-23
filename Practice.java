import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
class Practice {
    public static void main(String[] args){
        Scanner s= new Scanner (System.in);
        System.out.print("Enter the No. of an Array : - ");
        int n= s.nextInt();
        int[] arr = new int[n];
        boolean found=false;
        HashMap<Integer,Integer> seen=new HashMap<>();
        //Input An Array
        for(int i=0;i<n;i++){
            int input=s.nextInt();
            arr[i]=input;
            seen.put(arr[i],i);
            }

        System.out.println("Enter the Target");
        int target=s.nextInt();
        //finding process
        for(int i=0;i<n;i++){
            int need=target-arr[i];
            if(seen.containsKey(need)){
                System.out.println(Arrays.toString(new int[] {seen.get(need) ,i}));
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}