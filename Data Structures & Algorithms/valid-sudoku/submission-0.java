class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] column = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                Character a = board[i][j];
                if(a == '.'){
                    continue;
                }
                if(!row[i].add(a)){
                    return false;
                }
                if(!column[j].add(a)){
                    return false;
                }
                int boxIndex = (i/3)*3+(j/3);
                if(!boxes[boxIndex].add(a)){
                    return false;
                }
            }
        }
        return true;
    }
}
