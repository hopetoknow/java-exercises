Implement the public static method isContinuousSequence(), which checks if the sequence of integers in the passed array is increasing continuously (with no missing numbers). For example, the sequence {4, 5, 6, 7} is continuous, but {0, 1, 3} is not. The sequence can start with any number, the main condition is that there are no missing numbers. A sequence of one number cannot be considered increasing.
```
int[] numbers1 = {10, 11, 12, 13};
App.isContinuousSequence(numbers1); // true

int[] numbers2 = {-5, -4, -3};
App.isContinuousSequence(numbers2); // true

int[] numbers3 = {10, 11, 12, 14};
App.isContinuousSequence(numbers3); // false

int[] numbers4 = {1, 2, 2, 3};
App.isContinuousSequence(numbers4); // false

int[] numbers5 = {5};
App.isContinuousSequence(numbers5); // false

int[] numbers6 = {};
App.isContinuousSequence(numbers6); // false
