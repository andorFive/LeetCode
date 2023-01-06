/**
 * @author andorFive
 * @date 2023/1/5
 */
public class leetCode167 {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1,0};
        int target = -1;
        twoSum(numbers,target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        //获取数组长度
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i]+numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
