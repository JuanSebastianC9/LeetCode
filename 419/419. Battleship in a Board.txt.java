class Solution {
    public int countBattleships(char[][] board) {
        int boat = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    boat++; 
                    while(j+1 < board[i].length && board[i][j+1] == 'X'){
                        j++;
                    }
                    int count = i;
                    while(count+1 < board.length && board[count+1][j] == 'X'){
                        count++;
                        board[count][j] = '.';
                    }
                }
            }
        }
        return boat;
    }
}