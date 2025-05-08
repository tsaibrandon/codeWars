/*
Instructions:
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
*/


// My Answer
function removeExclamationMarks(s) {
    let result = ""
    for (let i = 0; i < s.length; i++) {
        if (s[i] !== "!") {
            result += s[i]
        }
    }
    return result;
}


// Other Correct/Interesting Answers