The operation of multiplication of two matrices A and B is the calculation of the resulting matrix C, where each element C(ij) is equal to the sum of the products of elements in the corresponding row of the first matrix A(ik) and elements in the column of the second matrix B(kj).

Two matrices can be multiplied only if the number of columns in the first matrix coincides with the number of rows in the second matrix. It means that the first matrix must necessarily be consistent with the second matrix. The result of the operation of multiplying a matrix of size M×N by a matrix of size N×K is a matrix of size M×K.

Implement a public static method multiply() that takes two matrices with integers as input, and returns a new matrix - the result of their product.
```
int[][] matrixA = {
  {2, 5},
  {6, 7},
  {1, 8},
};

int[][] matrixB = {
  {1, 2, 1},
  {0, 1, 0},
};

var multipliedMatrix = App.multiply(matrixA, matrixB);

System.out.println(Arrays.deepToString(multipliedMatrix)); // =>
// [
//   [2, 9, 2],
//   [6, 19, 6],
//   [1, 10, 1],
// ]