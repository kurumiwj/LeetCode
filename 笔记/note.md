# 常用算法

## 交换两个非0元素

```java
arr[i] ^= res[j];
res[j] ^= res[i];
res[i] ^= res[j];
```

## 判断奇偶

- 偶数: `num & 1 == 0`

- 奇数: `num & 1 == 1`


