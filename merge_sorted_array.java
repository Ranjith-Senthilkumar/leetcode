class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n+m ; ++i)
        {
            if(i<=m-1)
            {
                nums1[i]=nums1[i];
            }
            else if (i>m-1)
            {
                nums1[i]=nums2[i-m];
            }
        }
        Arrays.sort(nums1);
        String s = Arrays.toString(nums1);
        System.out.print(s);
    }
}
