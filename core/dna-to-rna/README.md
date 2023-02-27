DNA and RNA are nucleotide sequences.

The four nucleotides in DNA are adenine (A), cytosine (C), guanine (G), and thymine (T).

The four nucleotides in RNA are adenine (A), cytosine (C), guanine (G), and uracil (U).

The RNA chain is made up from the DNA chain by sequentially replacing each nucleotide:

G -> C  
C -> G  
T -> A  
A -> U  

Implement a method dnaToRna() that takes as input a DNA strand and returns a corresponding RNA strand (performs RNA transcription).

If the input parameter does not contain a single nucleotide (i.e. an empty string is passed), the function should return an empty string. If an "unknown" nucleotide (not one of the four listed above) is found in the passed DNA strand, the function must return null.


```
diff(0, 45) === 45;   
diff(0, 180) === 180;
diff(0, 190) === 170;
diff(120, 280) === 160;
