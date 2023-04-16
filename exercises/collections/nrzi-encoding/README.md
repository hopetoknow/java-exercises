The NRZI code (Non Return to Zero Invertive) is one of the linear coding methods. It has two signal levels and is used
to transmit bit sequences containing only 0 and 1. NRZI is used, for example, in optical cables where only two signal
states - light and dark - are constantly detected.

When a logical zero is transmitted, the potential set in the previous cycle is transmitted to the input of the encoder
(i.e. the state of the potential does not change), and when a logical one is transmitted, the potential is inverted
to the opposite state.

In the ```App``` class, implement the public static method ```nrzi()```, which takes a string as a graphical
representation of a linear signal and returns a string with a binary code. Study the examples carefully.
```
String signal1 = "_|¯|____|¯|__|¯¯¯";
App.nrzi(signal1); // "011000110100"
 
String signal2 = "|¯|___|¯¯¯¯¯|___|¯|_|¯";
App.nrzi(signal2); // "110010000100111"
 
String signal3 = "¯|___|¯¯¯¯¯|___|¯|_|¯";
App.nrzi(signal3); // "010010000100111"
 
String signal4 = "";
App.nrzi(signal4); // ""
 
String signal5 = "|";
App.nrzi(signal5); // ""
