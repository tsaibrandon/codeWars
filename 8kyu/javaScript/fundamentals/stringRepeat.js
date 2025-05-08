/*
Instructions:
Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
*/


// My Answer
function repeatStr(n, s) {
    let newStr = ''
    for (let i = 0; i < n; i++) {
        newStr += s
    }
    return newStr;
}


// Other Correct/Interesting Answers
function repeatStr(n, s) {
    return s.repeat(n);
}