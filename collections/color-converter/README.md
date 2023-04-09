HTML and CSS use hexadecimal numbers to specify colours. To avoid confusion when defining a number system,
the hexadecimal number is preceded by a # sign, such as #135278. The colour (rrggbb) is split into three components,
where the first two characters represent the red component of the colour, the middle two represent the green component,
and the last two represent the blue component. Thus, each of the three colours red, green and blue can take values
from 00 to FF in hexadecimal.

When working with colours, you often need to get separate values of red, green and blue (RGB) colour components in
decimal notation and vice versa. In App class implement public static methods rgbToHex() and hexToRgb() that return
corresponding colour representations.

The rgbToHex() method takes three integers as input - the values of the components in decimal system.
The method must return a string - a colour value in hexadecimal notation

The ```hexToRgb()``` method, on the contrary: it takes a string - a colour value in hexadecimal and must return
the dictionary Map<String, Integer> with the values of colour components in decimal
```
Map<String, Integer> rgb = App.hexToRgb("#24ab00");
System.out.println(rgb); // {b=0, g=171, r=36}

App.rgbToHex(36, 171, 0); // "#24ab00"
