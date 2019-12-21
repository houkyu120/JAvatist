package Structure;
/*
迷宫问题
*/

public class maze {
    public static void main(String[] args) {
        maze maze=new maze();

        System.out.println();

        int[][] maze1 = new int[8][8];
        for (int i = 0; i < maze1.length; i++) {
            for (int j = 0; j < maze1.length; j++) {
                maze1[i][0]=maze1[i][7]=1;
                maze1[0][j]=maze1[7][j]=1;


            }

        }
        maze1[5][2]=1;
        maze1[5][1]=1;
        maze.maze2(maze1, 0, 0);

        for (int i = 0; i < maze1.length; i++) {
            for (int j = 0; j < maze1.length; j++) {
                maze1[i][0]=maze1[i][7]=1;
                maze1[0][j]=maze1[7][j]=1;

                System.out.print( maze1[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public boolean maze2(int[][] mae1, int a, int b) {
        if (mae1[6][6] == 2) {
            return true;
        } else {
            if (mae1[a][b] == 0) {
                mae1[a][b] = 2;
                if (maze2(mae1, a + 1, b)) {
                    return true;
                } else if (maze2(mae1, a, b + 1)) {
                    return true;
                } else if (maze2(mae1, a - 1, b)) {
                    return true;
                } else if (maze2(mae1, a, b - 1)) {
                    return true;

                } else {
                    return false;
                }



            }
            return false;

        }
    }}