package NewPlacementS;

public class Sort012 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,1,1,0};
        sort(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }//Explaination We have to sort the array in constant space
        //so for that We USE DUTCH NATIONAL FLAG ALGORITHM
        // zero from 0 to low
        // 1 from low to mid
        // unknow from mid to high
        // 2 from high to n
        // we take 3 pointer low at 0 mid at 0 and high at last
        // if 0 then we swap mid with low and mid++ and low++
        // if 1 then we do mid++;
        // if 2 we swap mid with high and high--
    public static void sort(int []arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int temp;
        while(mid<=high){
            switch (arr[mid]){
                //swapping mid with low
                case 0:{
                    temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                // no swapping
                case 1:{
                    mid++;
                    break;
                }

                //swapping mid with high
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
