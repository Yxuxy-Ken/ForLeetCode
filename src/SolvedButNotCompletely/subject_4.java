package SolvedButNotCompletely;

import java.util.Arrays;

//两个数组找中位数, 二叉树, 但是不知道什么叫树, 这里先爆破
//虽然能过但肯定不合格,时间复杂度要求为O(log(m+n))
//HARD难度!!
public class subject_4 {
    public static double getMid(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        while (i < nums.length) {//O(n^2)
            if (n1 == nums1.length) {
                for (; n2 < nums2.length; n2++)
                    nums[i++] = nums2[n2];
                break;
            } else if (n2 == nums2.length) {
                for (; n1 < nums1.length; n1++)
                    nums[i++] = nums1[n1];
                break;
            }
            if (nums1[n1] < nums2[n2]) {
                nums[i++] = nums1[n1++];
            } else {
                nums[i++] = nums2[n2++];
            }
        }
        for (int x :
                nums) {
            System.out.print(x+",");

        }System.out.println();

        if(nums.length%2!=0){
            double end = nums[nums.length/2];
            return end;
        }else {
            System.out.println(nums[nums.length/2]+","+nums[nums.length/2-1]);
            double end = ( (double) nums[nums.length/2-1] +
                    (double) nums[nums.length/2] )
                    /2;
            return end;
        }
    }

    //脑残方法, 但是非常非常有效 不过还是不符合要求
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1 + n2];
        System.arraycopy(nums1, 0, nums, 0, n1);
        System.arraycopy(nums2, 0, nums, n1, n2);
        Arrays.sort(nums);//实际上为双轴快速排序, 时间复杂度为 O(n log(n)), 看了下实现, 这么离谱的排序复杂度只有这点?
        int n = nums.length;
        if (n % 2 == 0) {
            return (nums[(n/2)-1] + nums[n/2])/2.0;
        } else {
            return nums[n/2];
        }
    }
}
