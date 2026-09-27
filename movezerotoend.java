import java.util.Arrays;

class movezerotoend {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 0, 0, 40, 0, 0};
        movetoend(arr);
    }

    //Brute method Time Complexity is  O(n^2)
    /*static void movetoend(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                for (int j = i+1; j <arr.length ; j++) {
                    if(arr[j]!=0){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    */
    static void movetoend(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp=arr[i];
                arr[i]= arr[count];
                arr[count]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}