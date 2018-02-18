package Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Description:
 * @Author: J.Y.Zhang
 * @Date: 2018/2/3
    Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?

    Find all unique triplets in the array which gives the sum of zero.

    Note: The solution set must not contain duplicate triplets.

    For example, given array S = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
    [-1, 0, 1],
    [-1, -1, 2]
    ]
 */
public class ThreeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        /* 暴力 三层循环
        Arrays.sort(nums);//排序

        List<List<Integer>> result =   new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++){
                    List<Integer> listtemp = new ArrayList<Integer>();
                    if(i!= j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
                        listtemp.add(nums[i]);
                        listtemp.add(nums[j]);
                        listtemp.add(nums[k]);
                        if( !result.contains(listtemp)){
                            result.add(listtemp);
                        }
                    }
                }
            }
        }
        return result;
        */

        /** 一层循环 里面是2sum hashmap*/
        Arrays.sort(nums);//排序

        List<List<Integer>> result =   new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++){
            int target = -nums[i];
            int low = i + 1; int high = nums.length - 1;
            while (nums[i] == nums[i+1] && i < nums.length-2) i++;
            while( low < high){
                if( nums[low] + nums[high] == target){
                    result.add(Arrays.asList(nums[i],nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    low++; high--;
                } else if (nums[low] + nums[high] < target) {
                    low++;
                } else high--;
            }
        }
        return result;
    }
}
