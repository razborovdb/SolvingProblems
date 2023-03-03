package leetcode.MedianofTwoSortedArrays;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        // answer 2.5
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        double firstVal = 0;
        double secondVal = 0;
        boolean find1 = false;
        boolean find2 = true;

        int startIndex = (l1 + l2) / 2;
        int numIndex = 1;
        if ((l1 + l2) % 2 == 0) {
            startIndex -= 1;
            numIndex = 2;
            find2 = false;
        }

        int i1 = 0;
        int i2 = 0;

        if (numIndex == 1) {
            find2 = true;
        }
        while (i1 < l1 && i2 < l2) {
            if (nums1[i1] < nums2[i2]) {

                if (i1 + i2 == startIndex) {
                    firstVal = nums1[i1];
                    find1 = true;
                }
                if (i1 + i2 == startIndex + 1) {
                    secondVal = nums1[i1];
                    find2 = true;
                }
                i1++;

            } else {
                if (i1 + i2 == startIndex) {
                    firstVal = nums2[i2];
                    find1 = true;
                }
                if (i1 + i2 == startIndex + 1) {
                    secondVal = nums2[i2];
                    find2 = true;
                }
                i2++;
            }

            if (find1 && find2) {
                break;
            }
        }
        if (!(find1 && find2)) {
            while (i1 < l1) {
                if (i1 + i2 == startIndex) {
                    firstVal = nums1[i1];
                    find1 = true;
                }
                if (i1 + i2 == startIndex + 1) {
                    secondVal = nums1[i1];
                    find2 = true;
                }
                i1++;
                if (find1 && find2) {
                    break;
                }
            }
        }

        if (!(find1 && find2)) {
            while (i2 < l2) {
                if (i1 + i2 == startIndex) {
                    firstVal = nums2[i2];
                    find1 = true;
                }
                if (i1 + i2 == startIndex + 1) {
                    secondVal = nums2[i2];
                    find2 = true;
                }
                i2++;
                if (find1 && find2) {
                    break;
                }
            }
        }

        if (numIndex == 1) {
            return firstVal;
        }

        return (firstVal + secondVal) / 2;


    }

}
