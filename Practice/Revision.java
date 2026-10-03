import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class Revision {
    public static void main(String[] args){
        System.out.print("Enter the no. :-");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        boolean found = false;
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = s.nextInt();
        }
        System.out.print("Enter the Target :- ");
        int Target = s.nextInt();
        HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<n;i++){
            int need = Target-nums[i];
            if(sum.containsKey(need)){
                System.out.println(Arrays.toString(new int[] {sum.get(need),i}));
                found = true;
                break;
            }
            sum.put(nums[i],i);
        }
        if(!found)
            System.out.println("Element is not Found");
    }
}