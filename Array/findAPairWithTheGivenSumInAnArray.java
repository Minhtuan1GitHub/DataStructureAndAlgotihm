public class findAPairWithTheGivenSumInAnArray {

    public static void findPair(int[] arr, int target){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.printf("\nPair found (%d, %d)",arr[i],arr[j]);
                }
            }
        }
        System.out.println();
    }
    

    public static void main(String[] args){
        int[] arr = {8,7,2,5,3,1};
        findPair(arr, 10);
    }
}
