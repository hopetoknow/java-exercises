Implement the random number generator represented by the Random class. The class constructor takes as input seed - the initial number of the pseudorandom number generator. The generator's interface includes two functions:

getNext() - method that returns a new random number
reset() - method that resets the generator to its initial value.
```
var seq = new Random(100);
var result1 = seq.getNext();
var result2 = seq.getNext();

result1 != result2; // true

seq.reset();

var result21 = seq.getNext();
var result22 = seq.getNext();

result1 == result21; // true
result2 == result22; // true
