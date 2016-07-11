public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<int[]> result = new ArrayList();
        if(nums1 == null || nums2 == null || k == 0 || num1.length == 0 || num2.length == 0) {
            return result;
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
           public int compare(Pair p1, Pair p2){
                return p1.sum-p2.sum;
            } 
        });
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                Pair p = new Pair(nums1[i], nums2[j]);
                pq.offer(p);
            }
        }
        
        if(k>=pq.size()) k=pq.size();
        
        for(int i=0;i<k;i++){
            Pair p = pq.poll();
            result.add(new int[]{p.x, p.y});
        }
        return result;
        
    }
    
    class Pair() {
        int x;
        int y;
        int sum;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
            sum = x + y;
        }
    }
        
        
        
        
        
}