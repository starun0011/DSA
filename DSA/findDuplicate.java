import java.util.HashSet;
import java.util.Set;

class FindDuplicate{
    // public static boolean hasDuplicate(int[] arr){
    //     Arrays.sort(arr);
        
    //     for(int i=1; i<arr.length;i++){
    //         if(arr[i] == arr[i-1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static boolean hasDuplicate(int[] arr){
        Set distinct = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(distinct.contains(arr[i])){
                return true;
            }
            distinct.add(arr[i]);

        }
        return false;
    }

    public static void main(String[] arg){
        int[] arr = {10,11,12,13,11,15};
        boolean result = hasDuplicate(arr);
        System.out.println("is Array has duplicates: "+result);
    }
}