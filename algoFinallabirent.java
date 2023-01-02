
public class finalSoru {
  //Furkan can
    static void run(int col, int row, int[][] labirent1, String[][] cozum) {
        for (int i = 0; i < labirent1.length; i++) {
            for (int j = 0; j < labirent1[i].length; j++) {
                if (labirent1[i][j] == 9) {
                    col = i;
                    row = j;
                }
            }
        }
        cozum[0][0] = "1";
        if (labirent1[col][row] == 9) {
            cozum[col][row] = "9";
        }
        while (col != 0 && row != 0) {

            if (labirent1[0][0] != 1) {
                System.out.println("başlangiç 1 olmak zorunda");

                break;
            }
            if (col > 0 && labirent1[col - 1][row] == 1) {
                col--;
                cozum[col][row] = "1";
                labirent1[col + 1][row] = 2;

            } else if (row > 0 && labirent1[col][row - 1] == 1) {
                row--;
                cozum[col][row] = "1";
                labirent1[col][row + 1] = 2;

            } else if (row < 19 && labirent1[col][row + 1] == 1) {
                row++;
                cozum[col][row] = "1";
                labirent1[col][row - 1] = 2;

            } else {
                System.out.println("labirent çözülemedi");

                break;
            }

        }
        if (col == 0 || row == 0) {
            System.out.println("labirent çözüldü tebrikler");
        }

    }

    public static void main(String[] args) throws Exception {
        int[][] labirent = {

                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

        };
        String[][] czm = new String[20][20];
        int i = 0;
        int j = 0;
        run(i, j, labirent, czm);

        for (String[] a : czm) {
            for (String b : a) {

                if (b == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(b);
                }

            }
            System.out.println();
        }

    }
}
