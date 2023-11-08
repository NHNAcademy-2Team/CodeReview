package Select1.src.main.java.unit.eight;

import java.io.IOException;
import java.util.Objects;
import unit.nine.ExceptionWrongMatrixDimension;
import unit.nine.ExceptionWrongMatrixValue;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.9 Realize a Java class Matrix to represent bidimensional matrices of real numbers. The class should export the following methods:
 * Matrix(int n, int m) : constructor that creates a matrix of size nxm, with all values initially set to 0;
 * void save(String filename) : that saves the content of the matrix on the file specified by filename;
 * static Matrix read(String filename) : that reads the data about a matrix from the file specified by filename, creates the matrix, and returns it;
 * Matrix sum(Matrix m) : that returns the matrix that is the sum of the object and of m, if the two matrices have the same dimensions, and null otherwise;
 * Matrix product(Matrix m) : that returns the matrix that is the product of the object and of m, if the two matrices have compatible dimensions, and null otherwise.
 * <p>
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * Exercise 09.8 Define the exceptions that are necessary to catch the possible errors that can occur in the class Matrix of Exercise 8.9.
 * ExceptionWrongMatrixValues that is thrown in the method read if the data on the file does not correspond to numeric values, or if the data are not consistent with the form of a matrix (e.g., the rows have different length);
 * ExceptionWrongMatrixDimension that is thrown in the method read if the data on the file do not correspond to the dimension of the matrix.
 * Modify the class Matrix in such a way that it generates the new exceptions when necessary.
 */
//public class Exercise9 {
//    public static void main(String[] args) {
//        try {
//            matrixTest();
//        } catch (IOException | ExceptionWrongMatrixValue | ExceptionWrongMatrixDimension e) {
//            System.out.println(e.getMessage());
//        }
//    }

//    private static void matrixTest() throws IOException, ExceptionWrongMatrixValue, ExceptionWrongMatrixDimension {
//        Matrix firstMatrix = new Matrix(3, 3);
//        Matrix secondMatrix =
//                Matrix.read(
//                        Objects.requireNonNull(Exercise9.class.getClassLoader().getResource("matrix1.txt")).getFile());
//
//        Matrix thirdMatrix = firstMatrix.sum(secondMatrix);
//        Matrix fourthMatrix = firstMatrix.product(secondMatrix);
//
//        thirdMatrix.printMatrix();
//        fourthMatrix.printMatrix();
//    }
//}
