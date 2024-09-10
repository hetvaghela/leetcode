import java.util.Arrays;

public class Movezeroesproblem{

    public void movezero(int[] nums)
    {
        int nonzeroindex = 0;

        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
            nums[nonzeroindex] = nums[i];
            nonzeroindex++;
            }
        }
        for(int i = nonzeroindex; i <nums.length; i++)
         {
            nums[i] = 0;
         }

    }
    public static void main(String[] args)
    {
        Movezeroesproblem solution = new Movezeroesproblem();
        
        int[] nums1 = {0,2,3,0,43};
        solution.movezero(nums1);
        System.out.println(Arrays.toString(nums1));
        }
}


