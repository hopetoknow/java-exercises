Implement the public static methods rotateLeft() and rotateRight(), which rotate the matrix to the left
(counterclockwise) and respectively to the right (clockwise). The matrix is a two-dimensional array of
integers. The methods must return a new matrix without changing the original one.
```
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 0, 1, 2},
};

var rotatedLeft = App.rotateLeft(matrix);
System.out.println(Arrays.deepToString(rotatedLeft)); // =>
// [
//   [4, 8, 2],
//   [3, 7, 1],
//   [2, 6, 0],
//   [1, 5, 9],
// ]

var rotatedRight = App.rotateRight(matrix);
System.out.println(Arrays.deepToString(rotatedRight)); // =>
// [
//   [9, 5, 1],
//   [0, 6, 2],
//   [1, 7, 3],
//   [2, 8, 4],
// ]
