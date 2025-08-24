package com.example.hellodemo.leetcode.p48;//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
//
// Related Topics 数组 回溯 排序 👍 1734 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, res, path, used);
        return res;
    }

    private void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i >= 1 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, res, path, used);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        com.example.hellodemo.leetcode.p48.Solution solution = new com.example.hellodemo.leetcode.p48.Solution();
        System.out.println(solution.permuteUnique(new int[]{1, 1,2, 3}));
        System.out.println(solution.permuteUnique(new int[]{1, 2, 3}));
        // 在F:\idea_project\leetCodeSol\src\main\java\com\example\hellodemo\leetcode目录下新建p1到p200的子文件夹

    }
}
//leetcode submit region end(Prohibit modification and deletion)
