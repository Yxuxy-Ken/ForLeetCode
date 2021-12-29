package subjectPartOneToTen;

//两个数组找中位数, 二叉树, 但是不知道什么叫树, 这里先爆破
public class subject_4 {
    public static double getMid(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        while (i < nums.length) {
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
}
