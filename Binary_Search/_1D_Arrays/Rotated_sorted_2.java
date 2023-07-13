package Binary_Search._1D_Arrays;

public class Rotated_sorted_2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(search(arr,1));
    }

    private static boolean rotated_2(int[] arr, int k) {
        return false;
    }
    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int end = n - 1 ,start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (!isBinarySearchHelpful(nums, start, nums[mid])) {
                start++;
                continue;
            }
            boolean pivotArray = existsInFirst(nums, start, nums[mid]);

            boolean targetArray = existsInFirst(nums, start, target);
            if (pivotArray ^ targetArray) {
                if (pivotArray) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    private static boolean isBinarySearchHelpful(int[] arr, int start, int element) {
        return arr[start] != element;
    }

    private static boolean existsInFirst(int[] arr, int start, int element) {
        return arr[start] <= element;
    }
}
