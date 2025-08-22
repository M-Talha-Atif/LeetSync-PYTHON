class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        int wordLength = word.length();
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (dfs(board, word, wordLength, 0, row, col, rows, cols)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int wordLength, int index, int row, int col, int rows, int cols) {
        // base condition: found the word
        if (index == wordLength) {
            return true;
        }
        // base condition: out of bounds or mismatch
        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '*'; // mark as visited

        // explore 4 directions: up, down, left, right
        boolean found = dfs(board, word, wordLength, index + 1, row - 1, col, rows, cols) ||
                        dfs(board, word, wordLength, index + 1, row + 1, col, rows, cols) ||
                        dfs(board, word, wordLength, index + 1, row, col - 1, rows, cols) ||
                        dfs(board, word, wordLength, index + 1, row, col + 1, rows, cols);

        board[row][col] = temp; // backtrack
        return found;
    }
}
