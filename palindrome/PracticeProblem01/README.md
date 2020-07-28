# More Palindroms More Problems

## The problem

Given a string, find all possible palindromic partitions of a given string.

### Example

#### input 
```
racecar
```

#### output
```
r a c e c a r
r aceca r
r a cec a r

```

The idea is to go through every substring starting from first character, check if it is palindrome. If yes, then add the substring to solution and recur for remaining part. Before you start coding, create your UNIT TEST!!!!