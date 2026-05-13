class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x: nums){
         
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // List<Map.Entry<Integer,Integer>> a = map.entrySet().stream()
        // .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        // .limit(k)
        // .collect(Collectors.toList());
        List<Map.Entry<Integer,Integer>> mapList = new ArrayList<>(map.entrySet());

        mapList.sort((a,b)-> b.getValue()-a.getValue());


        int [] x = mapList.stream().mapToInt(Map.Entry::getKey).limit(k).toArray();
return x;


    }
}
