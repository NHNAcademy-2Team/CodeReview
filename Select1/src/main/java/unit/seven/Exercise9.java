package unit.seven;

//https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
//Exercise 07.9 A matrix M is said to be symmetric if it is square (i.e., has the same number of rows and columns) and M[i][j] is equal to M[j][i], for each pair of valid indexes i and j.
// Write a predicate static boolean symmetric(int[][] M) that returns true if the matrix M is symmetric, and false otherwise.
public class Exercise9 {
    public static void main(String[] args) {
        //보류
        int[][] m = {
                {1, 2, 3, 7},
                {2, 4, 5, 8},
                {3, 5, 6, 9},
                {7, 8, 9, 10}
        };

        System.out.println(symmetric(m));
    }

    public static boolean symmetric(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    continue;
                }
                if (m[i][j] == m[j][i]) {
                    count++;
                }
            }
        }
        //이게 문제임
        if (count / 2 == m.length) {
            return true;
        }
        return false;
    }
}
