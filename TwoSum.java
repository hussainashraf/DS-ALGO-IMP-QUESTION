package NewPlacementS;

public class TwoSum {

    public static void main(String[] args) {
        int ans[] = {3,2,4};
        int target = 6;
        int arr [] = twosum(ans,target);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static int[] twosum(int [] arr,int target){
        int ans[]  = new int[2];
    for(int i  = 0 ; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
    return ans;
    }
}
