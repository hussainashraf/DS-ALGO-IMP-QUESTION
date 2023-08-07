package NewPlacementS;

public class ReversePair {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        System.out.println(merge(arr, 0, arr.length - 1));
//        System.out.println(bruteforce(arr));
    }

    //    public static int bruteforce(int[] arr) {
//        int count = 0;
//        int i = 0, j = arr.length - 1;
//        while (i < j) {
//            if (arr[i] > 2 * arr[j])
//
//                count++;
//            i++;
//            if (i == j)
//                j--;
//
//        }
//        return count;
//    }
//}
//    public static int bruteforce(int arr[]){
//        int count = 0;
//        for(int i = 0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]>2*arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//1,3,2,3,1
    public static int merge(int[] arr, int low, int high) {
        if (low == high) {
            return 0;
        }
        int count = 0;
        int mid = (low + high) / 2;
        count+=merge(arr, low, mid);
        count+=merge(arr, mid + 1, high);
        count+= countPairs(arr, low, mid, high);
        return count;
    }

    //1,2,3,4,5,6
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int i = low;
        int j = mid + 1;
        int k = 0;

        int c[] = new int[high-low+1];
        while (i <= mid && j <= high) {
            if (arr[i] > 2 * arr[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }
        i = low;
        j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                c[k] = arr[i];
                i++;
                k++;
            } else {
                c[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            c[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            c[k] = arr[j];
            k++;
            j++;
        }
        k = 0;
//        for (int z = low; z <= high; z++) {
//            arr[k] = c[k];
//            k++;
//        }
        System.arraycopy(c,0,arr,low,high-low+1);
        return count;
    }
}