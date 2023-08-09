package NewPlacementS;

public class FindRepeatedNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int ans = findrepeatedNo(arr);
        System.out.println(ans);
    }

    //bruteforce approch
//    public static int findrepeatedNo(int[]arr){
//        int ans = 0;
//        for(int i =  0 ; i<arr.length;i++){
//            for (int j = i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                     ans =  arr[i];
//                }
//            }
//        }
//        return ans;
//    }

    //optimised
    public static int findrepeatedNo(int ans[]){
        int an = 0;
        int fre [] = new int[ans.length];
        for (int i  = 0; i< fre.length;i++){
            fre[ans[i]]++;
        }
        for (int i  = 0;i< fre.length;i++){
            if(fre[i]>1){
                an = i;
            }
        }
        return an;

    }
}
