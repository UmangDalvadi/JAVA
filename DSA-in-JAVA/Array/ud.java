// import java.util.List;

// public class ud {
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        bool result[] = new bool[candies.length];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (max <= (candies[i] + extraCandies)) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;

    }
}
