In the App class implement the public static method filterAnagram(), which finds all anagrams of the word.
The method takes a source word and a list to check (List of strings).
The method should return List of all anagrams. If there are no anagrams in the word list, an empty list is returned.
```
List<String> list1 = List.of("aabb", "abcd", "bbaa", "dada");
List<String> result1 = App.filterAnagram("abba", list1);
System.out.println(result1); // ["aabb", "bbaa"]

List<String> list2 = List.of("crazer", "carer", "racar", "caers", "racer");
List<String> result2 = App.filterAnagram("racer", list2);
System.out.println(result2); // ["carer", "racer"]

List<String> list3 = List.of("lazing", "lazy", "lacer");
List<String> result3 = App.filterAnagram("laser", list3);
System.out.println(result3); // []
