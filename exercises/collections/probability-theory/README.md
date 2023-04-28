In ```App``` class, implement public static method ```calculateProbabilities()```, which takes as input a ```List``` of
integers and returns a ```Map``` dictionary. The key of this object is the number in the list, and the value is another
dictionary where the keys are the numbers that fell right after the initial number, and the values are the
probabilities of those numbers falling out.

For example, if your input is a list of numbers ```1, 3, 1, 5, 1,``` the resulting object would look like this:
```
{
  1={3=0.5,5=0.5},
  3={1=1.0},
  5={1=1.0}
}
```
After number 1, numbers 3 and 5 would fall out with an equal probability of 0.5. After numbers 3 and 5, one always
falls out, giving a probability of 1.
```
Map<Integer, Map<Integer, Double>> result1 = App.calculateProbabilities(
new ArrayList<Integer>()
);
System.out.println(result1); // => {}

Map<Integer, Map<Integer, Double>> result2 = App.calculateProbabilities(
List.of(1, 3, 1, 5, 1, 2, 1, 6)
);
System.out.println(result2);
// => {1={2=0.25, 3=0.25, 5=0.25, 6=0.25}, 2={1=1.0}, 3={1=1.0}, 5={1=1.0}, 6={}}