/**
 * @author hht
 * @date 2020/4/13 15:24
 */
public class Fibonacci {
    public static long F(int n, long a[]) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        a[n] = a[n - 1] + a[n - 2];
        return a[n];
    }

    /**
     * 计算阶乘
     */
    public static long F2(int n) {
        if (n == 1) return 1;
        return n * F2(n - 1);
    }

    /**
     * 二分查找的简单实现
     *
     * @param a
     * @param key 待查找的key
     * @return
     */
    public static int binarySearch(int a[], int key) {
        int length = a.length;
        // 初始化两个头尾指针
        int left = 0;
        int right = length;
        int mid = (left + right) / 2;
        for (int i = 0; i <= length / 2; i++) {
            if (key == a[mid]) return mid;
            if (key > a[mid]) {
                left = mid;
                System.out.println(i + "-------left:" + left);
            } else {
                right = mid;
                System.out.println(i + "-------right:" + right);
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    /**
     * 递归二分查找   并记录递归深度
     * <p>
     * 递归思想：要分解为一个一个子问题
     * 也就是拆分为一个一个子数组：
     * 计算第一个子数组的中间节点 与key比较
     *
     * @param a
     * @param key
     * @return
     */
    public static int recursiveBinarySearch(int a[], int key, int left, int right, int depth) {
        System.out.println("深度：" + depth++);
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (key > a[mid]) {
            return recursiveBinarySearch(a, key, mid + 1, right, depth);
        } else if (key < a[mid]) {
            return recursiveBinarySearch(a, key, left, mid - 1, depth);
        } else {
            return mid;
        }
    }

    /**
     * 二项分布
     *
     * @return
     */
    public static double binomialDistribution(int N, int K, double p) {
        if (N == 0 && K == 0) return 1.0;
        if (N < 0 || K < 0) return 0.0;
        return (1.0 - p) * binomialDistribution(N - 1, K, p) + p * binomialDistribution(N - 1, K - 1, p);
    }

    public static void huZhi(boolean[][] booleans) {
        for (int i = 0; i < booleans.length; i++) {
            for (int j = 0; j < booleans[i].length; j++) {
                if (isHuZhi(i, j)) {
                    booleans[i][j] = true;
                }
            }
        }
    }

    /**
     * 判断两个数是否为互质
     * <p>
     * 性质：
     * 公约数只有1的两个数叫做互质数
     * <p>
     * 需要利用欧几里算法 求最大公约数
     * 互质为求其最大公约数是否为1，如果为1的话之间互质。
     *
     * @param m m
     * @param n n
     * @return 是互质 返回true
     */
    private static boolean isHuZhi(int m, int n) {
        int t = 0;
        //当m=0说明两个数之间存在倍数关系
        while (m > 0) {
            t = n % m;
            n = m;
            m = t;
        }
        if (n == 1) return true;
        return false;

    }

    public static <T> void printTwoArray(boolean[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       /* long startTime = System.currentTimeMillis();
        long[] a = new long[100];
        a[1] = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + F(i, a));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);*/

        // System.out.println(F2(100));

        int[] bb = {1, 2, 6, 9, 12, 15, 20, 21, 22, 32};
        System.out.println(binarySearch(bb, 9));
        System.out.println(recursiveBinarySearch(bb, 9, 0, bb.length - 1, 0));


        boolean[][] booleans = new boolean[10][10];
        huZhi(booleans);
        printTwoArray(booleans);

    }
}
