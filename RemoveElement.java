public class RemoveElement {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,k=nums.length;
        while(i<j){
            if(nums[i]==val){
                nums[i]=nums[j];
                j--;
                k--;
                continue;
            }
            else{
                i++;
            }
        }
        return k;
    }
}
