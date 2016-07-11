public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1 == null || nums2 == null || k == 0) {
            return null;
        }
        
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                result.add(new int[]{nums1[i],nums2[j]});
            }
        }
        
       Collections.sort(result, new Comparator<int[]>(){
            public int compare(int[] n1, int[] n2){
                return (n1[0]+n1[1]) - (n2[0]+n2[1]);
            }
        });
        
        if(result.size()<k){
            return result;
        }
        return result.subList(0,k);
    }
}