This is the popular game Battleship.

Implement the public static method calculateShipCount(),
which takes as input the field as a square two-dimensional array of integers of zeros and ones.
Zero is an empty cell, one is a part of a ship. The function should return the number of ships on the field.

Since the ships should not touch each other, implement the isValidField() method, which checks the arrangement of
ships for correctness.
```
int[][] field1 = {
    {1, 1, 0, 0, 0, 0},
    {0, 0, 0, 1, 1, 1},
    {0, 0, 0, 0, 0, 0},
    {0, 1, 1, 1, 0, 1},
    {0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 0},
};
App.calculateShipCount(field1); // 6

int[][] field2 = {
    {0, 1, 0, 0},
    {1, 0, 0, 1},
    {0, 0, 0, 0},
    {0, 1, 1, 1},
};

App.isValidField(field2); // false
