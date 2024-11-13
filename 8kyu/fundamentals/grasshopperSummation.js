/*
Instructions:

Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0. Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.

For example (Input -> Output):
2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
*/


// My Answer ******** WRONG ********
var summation = function (num) {
    for (let i = 1; i <= num; i++) {
        let output = 0
        output = output + i
        return output
    }

}

// Other Correct/Interesting Answers
var summation = function (num) {
    let result = 0;
    for (var i = 1; i <= num; i++) {
        result += i;
    }

    return result;
}

var summation = function (num) {
    var sum = 0;
    for (var i = 0; i <= num; i++) {
        sum += i
    }
    return sum;
}

const summation = n => n * (n + 1) / 2;
