package NewPlacementS;

public class Sort012 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,1,1,0};
        sort(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void sort(int []arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int temp;
        while(mid<=high){
            switch (arr[mid]){
                case 0:{
                    temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
