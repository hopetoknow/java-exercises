In ```App``` class implement public static method ```findIndexOfClosest()```, which takes as input ```List``` of
integers and the number you are looking for. The task of the method is to find the closest number to the sought number
in the list and return its index in the list.

If the list contains several numbers that are simultaneously closest to the sought number, then the smallest of the
closest numbers' indexes is returned.
```
App.findIndexOfClosest(new ArrayList<Integer>(), 0); // -1

List<Integer> numbers1 = List.of(15, 10, 3, 4);
App.findIndexOfClosest(numbers1, 0); // 2

List<Integer> numbers2 = List.of(7, 5, 3, 2);
App.findIndexOfClosest(numbers2, 4); // 1

List<Integer> numbers3 = List.of(7, 5, 4, 4, 3);
App.findIndexOfClosest(numbers3, 4); // 2
