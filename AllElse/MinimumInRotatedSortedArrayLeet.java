package AllElse;

public class MinimumInRotatedSortedArrayLeet {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 0, 1};
        int res = findMin(arr);
        System.out.println(res);
    }

    public static int findMin(int[] arr) {
        pivot(arr);



        return pivot(arr);

    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[start]) {
                end = mid;

            } else {
                if (arr[end - 1] > arr[end]) {
                    start = end;

                }
                end--;
            }

        }
        return arr[start];

    }
}