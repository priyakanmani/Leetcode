class Solution {
    public int countBattleships(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='.') continue;
                if(i<row-1 &&board[i+1][j]=='X') continue;
                if(j<col-1 && board[i][j+1]=='X') continue;
                count++;
            }
        }
        return count;
    }
}