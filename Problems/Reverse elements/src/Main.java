
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int r = 0; r < twoDimArray.length; r++) {
            int rowLen = twoDimArray[r].length;
            for (int c = 0; c < rowLen / 2; c++) {
                int tmp = twoDimArray[r][rowLen - 1 - c];
                twoDimArray[r][rowLen - 1 - c] = twoDimArray[r][c];
                twoDimArray[r][c] = tmp;
            }
        }
    } // psv reverseElements()
} // class ArrayOperations
