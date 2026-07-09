package com.kurumi.leetCode.codeThoughts.entity;

import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午12:29:45
 * @Description Node1
 */
public class Node1 {
    public int val;
    public List<Node1> children;

    public Node1() {
    }

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, List<Node1> _children) {
        val = _val;
        children = _children;
    }
}
