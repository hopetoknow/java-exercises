This is the popular game Battleship.

Implement the public static method calculateShipCount(),
which takes as input the battlefield as a square two-dimensional array of integers of zeros and ones.
Zero is an empty cell, one is a part of a ship. The function should return the number of ships on the battlefield.

Since the ships should not touch each other, implement the isValidField() method, which checks the arrangement of
ships for correctness.
```
int[][] battleField1 = {
    {1, 1, 0, 0, 0, 0},
    {0, 0, 0, 1, 1, 1},
    {0, 0, 0, 0, 0, 0},
    {0, 1, 1, 1, 0, 1},
    {0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 0},
};
App.calculateShipCount(battleField1); // 6

int[][] battleField2 = {
    {0, 1, 0, 0},
    {1, 0, 0, 1},
    {0, 0, 0, 0},
    {0, 1, 1, 1},
};

App.isValidField(battleField2); // false
