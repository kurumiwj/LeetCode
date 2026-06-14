package com.kurumi.leetCode.二分查找;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午3:29:49
 * @Description 1337. 矩阵中战斗力最弱的 K 行
 */
public class LeetCode_1337 {
    private static int findFirstZero(int[] m) {
        int i = 0, j = m.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (m[mid] == 1) i = mid + 1;
            else j = mid - 1;
        }
        return i;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            list.add(new int[] {i, findFirstZero(mat[i])});
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] nums1, int[] nums2) {
                if (nums1[1] != nums2[1]) return nums1[1] - nums2[1];
                else return nums1[0] - nums2[0];
            }
        });
        list.forEach(nums -> queue.offer(nums));
        int[] res = new int[k];
        int index = 0;
        while (index < k) {
            res[index++] = queue.poll()[0];
        }
        return res;
    }
}
