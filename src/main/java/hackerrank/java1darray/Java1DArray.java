package hackerrank.java1darray;

public class Java1DArray {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return nextMove(leap, game, 0, new boolean[game.length]);
    }

    public static boolean nextMove(int leap, int[] game, int curIndex, boolean[] isVisited) {
        if (curIndex == game.length - 1) return true;
        if (curIndex + leap >= game.length) return true;
        if (isVisited[curIndex]) return false;
        isVisited[curIndex] = true;
        if (game[curIndex+leap] == 0) {
            if (nextMove(leap, game, curIndex+leap,isVisited)) return true;
        }
        if (curIndex+1 <= game.length - 1) {
            if (game[curIndex+1] == 0) {
                if (nextMove(leap, game, curIndex+1,isVisited)) return true;
            }
        }
        if (curIndex-1 > 0) {
            if (game[curIndex-1] == 0) {
                if (nextMove(leap, game, curIndex-1,isVisited)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

           int[] game = new int[] {0,0,0,0,0,0,0};
           int leap = 3;

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );


    }
}
