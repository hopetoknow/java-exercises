In the App class, implement the public static method getMenCountByYear(), which takes a list of List users.
The method should return a Map dictionary, where the key is the year of birth (a number of type Integer)
and the value is the number of men born in that year (a number of type Long)
```
List<Map<String, String>> users = List.of(
    Map.of("name", "Bronn", "gender", "male", "birthday", "1973-03-23"),
    Map.of("name", "Reigar", "gender", "male", "birthday", "1973-11-03"),
    Map.of("name", "Eiegon", "gender", "male", "birthday", "1963-11-03"),
    Map.of("name", "Sansa", "gender", "female", "birthday", "2012-11-03"),
    Map.of("name", "Jon", "gender", "male", "birthday", "1980-11-03"),
    Map.of("name", "Robb", "gender", "male", "birthday", "1980-05-14"),
    Map.of("name", "Tisha", "gender", "female", "birthday", "2012-11-03"),
    Map.of("name", "Rick", "gender", "male", "birthday", "2012-11-03"),
    Map.of("name", "Joffrey", "gender", "male", "birthday", "1999-11-03"),
    Map.of("name", "Edd", "gender", "male", "birthday", "1973-11-03")
);

Map<Integer, Long> result = App.getMenCountByYear(users);
System.out.println(result); // {1980=2, 1999=1, 1963=1, 1973=3, 2012=1}
