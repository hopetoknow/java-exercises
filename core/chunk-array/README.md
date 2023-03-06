Implement a public static method chunk() that takes as input an array of strings and a number specifying the chunk size. The method should return a two-dimensional array consisting of chunks of the specified size.
```
String[] words = {"one", "two", "three", "four"};

var chunks1 = App.chunk(words, 2);
System.out.println(Arrays.deepToString(chunks1));
// => [["one", "two"], ["three", "four"]]

var chunks2 = App.chunk(words, 3);
System.out.println(Arrays.deepToString(chunks2));
// => [["one", "two", "three"], ["four"]]
