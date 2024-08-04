class Solution {
    public int maxMeetings(int n, int start[], int end[]) {
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));
        
        int count = 1; 
        int lastEndTime = meetings[0][1];
        
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }
        
        return count;
    }
}
