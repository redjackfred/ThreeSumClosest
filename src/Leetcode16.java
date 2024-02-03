import java.util.Arrays;

public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        // Edge case for not enough elements on nums array
        if(nums.length < 3) return -1;

        Arrays.sort(nums);

        // Initial closest sum sets to a max value of integer
        int closestSum = Integer.MAX_VALUE;
        // Loop through nums array until the last 3rd element
        for(int i = 0; i < nums.length - 2; i++){
            // Initialize indexes
            // j increments from i+1
            // k decrements from the last element
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                // Record the closest sum
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                // Index moving
                // When sum is smaller than target, j increments to make sum bigger
                // Otherwise k decrements to make sum smaller
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return closestSum;
    }
}
