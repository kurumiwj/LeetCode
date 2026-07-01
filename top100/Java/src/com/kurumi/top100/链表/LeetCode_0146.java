package com.kurumi.top100.链表;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-07-01 上午11:47:07
 * @Description 146. LRU 缓存
 */
public class LeetCode_0146 {
    static class LRUCache {
        private final int capacity;
        private final Map<Integer, Integer> cache = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            Integer value = cache.remove(key);
            if (value != null) {
                cache.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            Integer oldValue = cache.remove(key);
            if (oldValue != null) {
                cache.put(key, value);
            } else {
                // 容量已满
                if (cache.size() == capacity) {
                    cache.remove(cache.keySet().iterator().next());
                }
                cache.put(key, value);
            }
        }
    }

    static class LRUCache1 {
        private final int capacity;
        private final LinkedHashMap<Integer, Integer> cache;

        public LRUCache1(int capacity) {
            this.capacity = capacity;
            cache = new LinkedHashMap<>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return cache.size() > capacity;
                }
            };
        }

        public int get(int key) {
            return cache.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            cache.put(key, value);
        }
    }
}
