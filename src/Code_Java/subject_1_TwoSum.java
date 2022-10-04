package Code_Java;

import java.util.HashMap;

/**_EASY
 * https://leetcode.cn/problems/two-sum/
 * 给定一个整数数组 nums 和一个整数目标值 target
 * 请你在该数组中找出 和 为 目标值 的两个数, 返回下标
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class subject_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {

//23/84 爆破 难以置信的垃圾
//        for (int i = 0; i < nums.length; i++) {
//            for(int j=i;j<nums.length;j++)
//            {
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
        HashMap<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("target",target);
        for (int i = 0; i < nums.length; i++) {
        }

        return null;
    }
}
