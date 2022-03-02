/* Minimum Deletion Cost to Avoid Repeating Letters
Given a string s and an array of integers cost where cost[i] is the cost of deleting the ith character in s.

Return the minimum cost of deletions such that there are no two identical letters next to each other.

Notice that you will delete the chosen characters at the same time, in other words, after deleting a character, the costs of deleting other characters will not change.
*/
class Solution {
    public int minCost(String s, int[] cost) {
        int min = 0, prev = 0;
        for (int i = 1; i < s.length(); i ++) {
            char prevChar = s.charAt(prev);
            char curr = s.charAt(i);
            if (prevChar == curr) {
                if (cost[prev] < cost[i]) {
                    min += cost[prev];
                    prev = i;
                } else {
                    min += cost[i];
                }
            } else {
                prev = i;
            }
        }
        return min;
    }
}
