import javax.print.attribute.EnumSyntax;
import java.util.Arrays;
import java.util.Scanner;
class Practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of element :- ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < nums.length; i++) {
            int element = sc.nextInt();
            nums[i]=element;
        }
        //Logic For Zeroes to END (BRUTE Method)
        /*for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }*/
        //Logic For Less Time Complexitity
        int i=0, j=0;
        for (i=0;i< nums.length;){
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else{
                i++;
            }
        }
            System.out.println(Arrays.toString(nums));
    }
}