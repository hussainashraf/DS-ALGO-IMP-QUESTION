package NewPlacementS;

import java.util.Arrays;

public class MissingandRepeated {

    public static void main(String[] args) {
        int arr [] = {2,2};
        int [] ans = missingandrepated(arr);
        for (int i = 0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] missingandrepated(int[]arr){
        int ans[] = new int[2];
        int fre[] = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        for (int i  = 0 ;i< fre.length;i++){
            if(fre[i]>1){
                ans[0] = i;
            }
            if(fre[i]==0){
                ans[1] = i;
            }
        }

        Arrays.sort();



        return ans;
    }
}
