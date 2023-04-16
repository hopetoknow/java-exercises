In the App class, implement the public static method sameParityFilter, which takes List of integers as a parameter.
The method should return a new list consisting of elements with the same parity as the first element of the input list
```
List<Integer> list1 = List.of(-1, 0, 1, -3, 10, -2);
List<Integer> result1 = App.sameParityFilter(list1);
System.out.println(result1); // [-1, 1, -3]
 
List<Integer> list2 = List.of(2, 0, 1, -3, 10, -2);
List<Integer> result2 = App.sameParityFilter(list2);
System.out.println(result2); // [2, 0, 10, -2]
 
List<Integer> emptyList = new ArrayList<>();
List<Integer> result3 = App.sameParityFilter(emptyList);
System.out.println(result3); // []
