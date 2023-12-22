/**
 * @param {string} s
 * @return {number}
 */
var maxScore = function(s) {
    let max = 0;
    for(let i = 1; i < s.length; i++) {
        let count = 0;
        for(let j = 0; j < s.length; j++) {
            if(j < i && s[j] == '0') count++;
            if(j >= i && s[j] == '1') count++;
        }

        if(count > max) max = count;
    }
    return max;
};
