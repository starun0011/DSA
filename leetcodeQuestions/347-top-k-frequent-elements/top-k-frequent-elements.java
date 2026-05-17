class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }


        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int key : countMap.keySet()) {
            int frequency = countMap.get(key);
            bucket[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (!bucket[i].isEmpty()) {
                for (int element : bucket[i]) {
                    result[counter++] = element;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}