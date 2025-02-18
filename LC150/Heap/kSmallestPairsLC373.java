//O(k logk),O(k)
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getKey() - a.getKey());

        // push sum and elements till heap size is k
        // if sum is less than top of heap, then pop and push
        // if greater break, no need to continue
        // form the result with rest of heap's content

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];

                if (maxHeap.size() < k)
                    maxHeap.offer(new Pair<>(sum, new Pair<>(nums1[i], nums2[j])));
                else if (sum < maxHeap.peek().getKey()) {
                    maxHeap.poll();
                    maxHeap.offer(new Pair<>(sum, new Pair<>(nums1[i], nums2[j])));
                } else
                    break;

            }
        }

        List<List<Integer>> res = new ArrayList<>();

        while (!maxHeap.isEmpty()) {
            Pair<Integer, Integer> pair = maxHeap.poll().getValue();
            List<Integer> list = new ArrayList<>();
            list.add(pair.getKey());
            list.add(pair.getValue());

            res.add(list);

        }

        return res;

    }
}
