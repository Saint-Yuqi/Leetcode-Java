import java.util.HashMap; 
public class twosum{
    public static int[] twoSum(int[] nums, int target) {
        int[] result;
        result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            int k = target - nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] == k)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
       int[]nums = {1,3,3};
       int target = 6;
       for (int a : twoSum(nums, target))
       {
           System.out.println(a);
       }

    }
}



