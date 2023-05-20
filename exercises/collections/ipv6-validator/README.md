In ```App``` class implement public static method ```isValidIPv6()``` which checks IPv6 addresses (addresses of sixth
version of Internet protocol) for correctness. The method takes a string with an IPv6 address as input and returns
```true``` if  the address is valid, otherwise ```false```

Additional conditions:

- The function is case insensitive
- Leading zeros in digit groups are optional
- The longest sequence of zeros, for example `````:0:0:0:````` can be replaced by two colons ```::```.
This can only be done once.
- A single group of zeros ```:0:``` cannot be changed to ```::```
```
App.isValidIPv6("10:d3:2d06:24:400c:5ee0:be:3d"); // true
App.isValidIPv6("0B0:0F09:7f05:e2F3:0D:0:e0:7000"); // true
App.isValidIPv6("000::B36:3C:00F0:7:937"); // true
App.isValidIPv6("::1"); // true

App.isValidIPv6("2607:G8B0:4010:801::1004"); // false
App.isValidIPv6("1001:208:67:4f00:e3::2c6:0"); // false
App.isValidIPv6("2.001::"); // false
App.isValidIPv6("9f8:0:69S0:9:9:d9a:672:f90d"); // false