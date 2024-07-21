public class IntroductionToTree{
    class Solution {
        
        // Approach 1: TC --> O(log(i))
        static int countNodes1(int i) {
            return (1 << (i-1));
        }

        // Approach 2: TC --> O(1)
        static int countNodes2(int i) {
            return (1 << (i-1));
        }
    }
}
