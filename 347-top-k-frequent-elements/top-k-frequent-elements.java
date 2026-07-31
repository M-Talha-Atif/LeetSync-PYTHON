class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int number : nums)
            frequency.put(number,
                    frequency.getOrDefault(number, 0) + 1);

        List<Integer>[] buckets =
                new ArrayList[nums.length + 1];

        for (int number : frequency.keySet()) {

            int count = frequency.get(number);

            if (buckets[count] == null)
                buckets[count] = new ArrayList<>();

            buckets[count].add(number);
        }

        int[] answer = new int[k];

        int index = 0;

        for (int freq = buckets.length - 1;
             freq >= 1 && index < k;
             freq--) {

            if (buckets[freq] == null)
                continue;

            for (int number : buckets[freq]) {

                answer[index++] = number;

                if (index == k)
                    break;
            }
        }

        return answer;
    }
}