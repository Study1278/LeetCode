import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of an Array :- ");
        int n=sc.nextInt();
        boolean found=false;
        int[] arr=new int[n];

        for (int i=0 ; i<n; i++){
            int input = sc.nextInt();
            arr[i]=input;
        }
        System.out.println("Enter the Targer : -");
        int target=sc.nextInt();
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<n;i++) {
            int need = target - arr[i];
            if (seen.containsKey(need)){
                System.out.println(Arrays.toString(new int[] { seen.get(need), i }));
                found = true;
                break;
            }
            seen.put(arr[i],i);
        }
        if(!found)
            System.out.print("No Answer found");

    }
}