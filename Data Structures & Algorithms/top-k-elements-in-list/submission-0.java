class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<FreqEntry> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
        int[] res = new int[k];
        for(int i=0; i < nums.length; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i], value+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            FreqEntry record = new FreqEntry(entry.getKey(), entry.getValue());
            pq.add(record);
        }
        while(k > 0 && !pq.isEmpty()){
            res[k-1] = pq.poll().value;
            k--;
        }
        return res;
    }
}

class FreqEntry {
    int value;
    int freq;

    public FreqEntry(int value, int freq){
        this.value = value;
        this.freq = freq;
    }
}
