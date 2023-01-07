import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author andorFive
 * @date 2023/1/7
 */
public class leetCode88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new leetCode88().merge(nums1, 0, nums2, 1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arrayList1.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            arrayList1.add(nums2[i]);
        }
        arrayList1.sort(Comparator.naturalOrder());
        for (int i = 0; i < arrayList1.size(); i++) {
            nums1[i]=arrayList1.get(i);
        }
    }
}
