/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

 

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashMap;
import java.util.Map;

public class Solution1_1 {

//    public static int[] twoSum(int[] nums,int traget){
//        Map<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
//        for(int i=0; i< nums.length;i++){
//            if(hashMap.containsKey(traget-nums[i])){
//                return  new int[]{hashMap.get(traget-nums[i]),i};
//            }
//            hashMap.put(nums[i],i);
//        }
//        return null;
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};//
            }
            hashtable.put(nums[i], i);//使用num[i]作为key,是因为hashtable.get()这个函数只能按照key获取value,从后往前放
        }
        return new int[0];
    }

    public static int[] sum(int[] nums, int traget){
        Map<Integer,Integer> hastable = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(hastable.containsKey(traget-nums[i])){
                return new int[]{hastable.get(traget-nums[i]),i};
            }
            hastable.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums=new int[]{3,2,4,7,2,8};
        int traget = 10;
        int[] res=twoSum(nums,traget);

    }
}
