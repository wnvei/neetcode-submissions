class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for(int n :  count.keySet()) {
            int freq = count.get(n);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(n);
        }

        int[] res = new int[k];
        int i=0;

        for(int freq=bucket.length-1; freq>=0 && i<k; freq--){
            if(bucket[freq]!=null){
                for(int n : bucket[freq]) {
                    res[i++] = n;
                    if(i == k) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
