public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(n));
    }
    public static int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0,capacity=0;
        while(i<j){

            if(height[i]>=height[j]){
                capacity = (j-i)*(height[j]);
                j--;
            }
            else{
                capacity = (j-i)*(height[i]);
                i++;
            }
            if(capacity>max)max=capacity;
        }
        return max;
    }
}
