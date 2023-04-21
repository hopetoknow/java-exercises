In class ```App``` release implement public static methods ```ipToDecimal()``` and ```decimalToIp()``` which convert IP
address representation from decimal format with dots to 32-bit decimal number and back.

The ```ipToDecimal()``` method takes a string as input and should return a number of type ```long```.
The ```decimalToIp()``` method is vice versa: it takes a number of long type and returns a string.
```
App.ipToDec("128.32.10.1"); // 2149583361
App.ipToDec("0.0.0.0"); // 0
App.ipToDec("255.255.255.255"); // 4294967295

App.decToIp(2149583361L); // "128.32.10.1"
App.decToIp(0L); // "0.0.0.0"
App.decToIp(4294967295L); // "255.255.255.255"
