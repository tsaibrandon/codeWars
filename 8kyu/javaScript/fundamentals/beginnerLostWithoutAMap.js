/*
Instructions:
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]
*/


// My Answer
function maps(x) {
    let newX = []
    for (let i = 0; i < x.length; i++) {
        newX[i] = x[i] * 2
    }

    return newX
}


// Other Correct/Interesting Answers
function maps(x) {
    return x.map(n => n * 2);
}