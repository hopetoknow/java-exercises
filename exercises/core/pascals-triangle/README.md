Pascal's triangle is an infinite table of binomial coefficients that has a triangular shape. In this triangle there are ones on the top and on the sides. Each number is equal to the sum of two numbers above it. The lines of the triangle are symmetric with respect to the vertical axis.
```
0:      1
1:     1 1
2:    1 2 1
3:   1 3 3 1
4:  1 4 6 4 1
```
Implement a public static method generate() that returns the specified Pascal triangle string as an array of integers.

```
var result = App.generate(4);
System.out.println(Arrays.toString(result)); // => [1, 4, 6, 4, 1]
