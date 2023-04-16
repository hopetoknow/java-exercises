In this challenge, we'll look at rational numbers and basic operations on them.
You will implement a class for working with rational numbers.
A rational number is a number that can be represented as a fraction a/b, where a is the numerator of the fraction and b
is the denominator of the fraction. For rational numbers, the basic operations are addition and subtraction.

Implement a Rational class that represents a rational number. The class constructor takes two arguments - the numerator and the denominator of the number. The class must contain the following interface methods:

- The getNumerator() selector - returns the numerator
- The getDenominator() selector - returns the denominator
- The add() method - adds a rational number to another number passed to the method
- The sub() method - subtracts another number passed into the method from a rational number
- The toString() method returns a string representation of a rational number in the numerator/denominator format

The add() and sub() methods should return a new rational number, not change the current number. Don't forget to implement fraction normalization in a convenient way.

```
var rat1 = new Rational(3, 9);

rat1.getNumerator(); // 1
rat1.getDenominator(); // 3
rat1.toString(); // "1/3"

var rat2 = new Rational(10, 3);
var sum = rat1.add(rat2);
sum.toString(); // "11/3"

var sub = rat1.sub(rat2);
sub.toString(); // "-3/1"