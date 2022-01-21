package SolvedSubject;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/sum-of-unique-elements/
 *
 * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 *
 * 请你返回 nums 中唯一元素的 和 。
 */
public class _1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                int curr = map.remove(nums[i]);
                if (curr==1) sum+=nums[i];
            }
        }
        return sum;
    }
    public static void run(){
        _1748 run = new _1748();
        int[] nums = new int[]{1,2,2,3,4,4,5};
        System.out.println(run.sumOfUnique(nums));
    }

}
