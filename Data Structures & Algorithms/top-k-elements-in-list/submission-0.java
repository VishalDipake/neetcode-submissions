class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        List<Map.Entry<Integer, Integer>>list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] result = new int[k];

        for(int i=0; i<k;i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
