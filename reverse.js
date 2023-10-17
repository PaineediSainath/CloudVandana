function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a sentence: ", function(sentence) {
    const reversedSentence = reverseWords(sentence);
    console.log("Reversed sentence: " + reversedSentence);
    rl.close();
});
