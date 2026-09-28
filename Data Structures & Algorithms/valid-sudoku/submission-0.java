class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char cell=board[row][col];
                int box=(row/3)*3+(col/3);
                if(cell=='.'){
                    continue;
                }
                if(!rows[row].add(cell) || !cols[col].add(cell) || !boxes[box].add(cell)){
                    return false;
                }
            }
        }
        return true;
    }
}
