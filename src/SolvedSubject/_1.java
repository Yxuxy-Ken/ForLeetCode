package SolvedSubject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/submissions/
 */
public class _1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer end = map.get(target-nums[i]);
            if (end==null){
                map.put(nums[i], i);
            }else {
                return new int[]{map.get(target-nums[i]),i};
            }
        }
        return new int[0];

//        Map<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target-nums[i])){
//                return new int[]{map.get(target-nums[i]),i};
//            }
//            System.out.println(nums[i]+","+i);
//            map.put(nums[i], i);
//        }
//        return new int[0];
    }

    public static void run(){
        _1 run = new _1();
        int[] nums = new int[]{9,1,4,5};
        int num = 6;
        System.out.println(Arrays.toString(run.twoSum(nums, num)));
    }
}
