public class QueensAttackII {
    public static void main(String[] args) {
int[][] o=new int[4][2];
        queensAttack(4, 3, 3, 3,o);
    }

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        String[][] board = new String[n][n];


        int count = 0;
        board[r_q - 1][c_q - 1] = "x";
        System.out.println(board[r_q - 1][c_q - 1]);
        for(int i=0;i<k;i++){
            for(int a=0;a<2;a++){
                board[obstacles[i][a]][obstacles[i][a]]="o";
            }
        }
        int i = r_q + 1;
        int b = c_q + 1;
        while (i <= n && b <= n) {
            if(board[i-1][b-1]=="o"){
                break;
            }
            count++;
            i++;
            b++;
        }
        int c = r_q - 1;
        int d = c_q - 1;
        while (c > 0 && d > 0) {
            if(board[c-1][d-1]=="o"){
                break;
            }
            count++;
            c--;
            d--;
        }
        i = r_q + 1;
        d = c_q - 1;
        while (i <= n && d > 0) {
            if(board[i-1][d-1]=="o"){
                break;
            }
            count++;
            i++;
            c--;
        }
        c = r_q - 1;
        b = c_q + 1;
        while (c > 0 && b <= n) {
            if(board[c-1][b-1]=="o"){
                break;
            }
            count++;
            c--;
            b++;
        }
        count = count + (n - 1) * 2;
        System.out.println(count);
        return count;
    }
}


