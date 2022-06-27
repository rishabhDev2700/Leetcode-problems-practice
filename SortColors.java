public class SortColors {
    public static void main(String[] args){
        int[] ar = {2,0,2,1,1,0};
        sortColors(ar);
        for(int i:ar){
            System.out.print(i);
        }
    }
    public static void sortColors(int[] nums) {
        if (nums.length == 1) return;
        int start = 0,mid=0, end = nums.length-1,temp;
        while (mid <= end) {
            if(nums[mid]==0){
                temp = nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                start++;
            }else if(nums[mid]==2){
                temp = nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
                mid--;
            }
            mid++;
        }
    }
}
