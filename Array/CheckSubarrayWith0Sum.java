import java.util.Set;
import java.util.HashSet;

public class CheckSubarrayWith0Sum {

    public static boolean hasZeroSumSubarray(int[] arr){
        Set<Integer> set = new HashSet<>();
        set.add(0);

        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            sum+=arr[i];
            if (set.contains(sum)){
                return true;
            }else{
                set.add(sum);
            }
        }
        return false;
    }

    



    public static void main(String[] args){
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        System.out.println(hasZeroSumSubarray(arr));
    }

}