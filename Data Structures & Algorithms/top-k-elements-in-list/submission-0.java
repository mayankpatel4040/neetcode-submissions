class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x: nums){
         
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer,Integer>> a = map.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .limit(k)
        .collect(Collectors.toList());

        int [] x = a.stream().mapToInt(Map.Entry::getKey).toArray();
return x;


    }
}
