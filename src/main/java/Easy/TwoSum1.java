package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: J.Y.Zhang
 * @Date: 2018/2/3
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
       /* 暴力求和 注意内层和外层不同 内层i+1即可不必从0开始
        int[] result = {0,0};
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;*/
       /* hashtable
        */
        int[] result = {0,0};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }
        }
        return result;
    }
}
