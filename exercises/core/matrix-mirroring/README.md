Implement a public static method getMirrorMatrix() that takes a two-dimensional array (matrix) of integers. The method should return a two-dimensional array modified so that the right half of the matrix becomes a mirror copy of the left half, symmetric about the vertical axis of the matrix. For simplicity, let us assume that the matrix always has an even number of columns and the number of columns is always equal to the number of rows.
```
int[][] matrix = {
    {11, 12, 13, 14},
    {21, 22, 23, 24},
    {31, 32, 33, 34},
    {41, 42, 43, 44},
};

var mirroredMatrix = App.getMirrorMatrix(matrix);
System.out.println(Arrays.deepToString(mirroredMatrix)); //=>
// [
//     [11, 12, 12, 11],
//     [21, 22, 22, 21],
//     [31, 32, 32, 31],
//     [41, 42, 42, 41],
//  ]
