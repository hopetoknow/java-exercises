Given a string s containing just the characters '(', ')', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket.

```
isValid("(())");  // true
isValid("()()");  // true
isValid("((())"); // false