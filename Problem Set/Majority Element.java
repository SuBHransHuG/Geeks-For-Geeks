class Solution
{
    static int majorityElement(int a[], int size)
    {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = a.length;

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
