class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> seenRow = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[row][i] == '.'){
                    continue;
                } else if(seenRow.contains(board[row][i])){
                        return false;
                    }
                // if(seenRow.contains(board[row][i])){
                //     return false;
                // }
                seenRow.add(board[row][i]);
            }
        }

        for(int col = 0; col < 9; col++){
            Set<Character> seenCol = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[i][col] == '.'){
                    continue;
                } else if(seenCol.contains(board[i][col])){
                        return false;
                    }
                // if(seenCol.contains(board[i][col])){
                //     return false;
                // }
                seenCol.add(board[i][col]);
            }
        }

        for(int i = 0; i < 9; i++){
            Set<Character> seenSq = new HashSet<>();
            for(int j = 0; j < 3; j++){
                for(int k = 0;k < 3; k++){
                    int row = (i/3) * 3 + j;
                    int col = (j/3) * 3 + k;
                    if(board[row][col] == '.'){
                        continue;
                    } else if(seenSq.contains(board[row][col])){
                        return false;
                    }
                    // if(seenSq.contains(board[j][k])){
                    //     return false;
                    // }
                    seenSq.add(board[j][k]);
                }
            }
        }
        return true;

    }
}
