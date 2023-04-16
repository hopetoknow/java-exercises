Implement a public static method buildSnailPath() that takes a matrix of integers as input and returns an array
of matrix elements in order from the top left element clockwise to the inner element.
The movement through the matrix resembles a snail.
```
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
int[] result = App.buildSnailPath(matrix);
System.out.println(Arrays.toString(result));
// => [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
