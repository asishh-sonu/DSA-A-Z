public class IPL {

  private static final int[] ROW_DIRECTIONS = {-1, -1, -1, 0, 0, 1, 1, 1};
  private static final int[] COL_DIRECTIONS = {-1, 0, 1, -1, 1, -1, 0, 1};

  public static boolean exist(char[][] board, String word) {
    int rows = board.length;
    int cols = board[0].length;

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (board[row][col] == word.charAt(0) && dfs(board, row, col, 0, word)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean dfs(char[][] board, int row, int col, int index, String word) {
    if (index == word.length()) {
      return true;
    }

    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
      return false;
    }

    char temp = board[row][col];
    board[row][col] = '*'; 

    for (int i = 0; i < 8; i++) {
      int newRow = row + ROW_DIRECTIONS[i];
      int newCol = col + COL_DIRECTIONS[i];
      if (dfs(board, newRow, newCol, index + 1, word)) {
        return true;
      }
    }

    board[row][col] = temp; 

    return false;
  }

  public static void main(String[] args) {
    char[][] board = {
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'C', 'S'},
      {'A', 'D', 'E', 'E'}
    };
    String word = "ABCCED";

    System.out.println(exist(board, word)); 
  }
}
