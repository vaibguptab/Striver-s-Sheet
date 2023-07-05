package Arrays.Easy;

public class Check_Array_Sorted {

    public static void main(String[] args) 
    {   int[] arr = {1,3,4,5,6};
        System.out.println(check_Sorted(arr));

    }

    private static boolean check_Sorted (int[] arr) {
        int small=arr[0];
        for(int i =1 ;i<arr.length;i++){
            if(arr[i]>small) {
                small = arr[i];
            }
            else return false;
        }
        return true;
    }
    
}
