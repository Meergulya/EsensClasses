package AccessModifiers;

public class AskSezimTasks {

    public static void main(String[] args) {


    }
        public boolean modThree(int[] nums) {



            for(int i = 0; i < nums.length - 2; i++)
            {
                if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
                    return true;
            }
            return false;
        }
    public boolean has77(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 7)
            {
                if(nums[i+1] == 7)
                    return true;
                else if(i < nums.length - 2 && nums[i+2] == 7)
                    return true;
            }
        }
        return false;
    }










}













