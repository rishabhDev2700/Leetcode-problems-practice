import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] n = {0};
        int k = removeDuplicates(n);
        for(int i=0;i<k;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}
