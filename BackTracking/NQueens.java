public class NQueens {

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1;)
    }
    public static void nQueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); // function call
                board[row][j] = 'x'; //backtracking
            }
        }
    } 

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------chess board-------");
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        //initialise
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}
