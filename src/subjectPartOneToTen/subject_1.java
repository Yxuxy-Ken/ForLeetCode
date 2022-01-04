package subjectPartOneToTen;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target
 * 请你在该数组中找出和为目标值的两个数, 返回下标
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 练习题目, 没什么好说的
 */
public class subject_1 {

    //version-base-1.0
    //55ms 38.7MB
    public static int[] twoSum_0(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    num[0] = i;
                    num[1] = j;
                    return num;
                }
            }
        }
        return num;
    }

    //version-1.0
    //113ms 38.5MB
    public static int[] twoSum_1(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    num[0] = i;
                    num[1] = j;
                    return num;
                }
            }
        }
        return num;
    }
    //在1的基础上减小了内存损耗
    public static int[] twoSum_2(int[] nums, int target) {
        int[] num = new int[2];
        int i=0;int j=0;
        lable:for (i = 0; i < nums.length; i++) {
            for (j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    num[0] = i;
                    num[1] = j;
                    break lable;
                }
            }
        }
        return num;
    }

    public static void test(){
        int[] num1 = new int[]{2,4,11,15};
        int[] num2 = new int[]{2,2,11,15};
        int t1 = 6;
        int t2 = 4;
        int[] Result = subject_1.twoSum_0(num2,t2);
        for(int i:Result)
            System.out.println(i);
    }
}
