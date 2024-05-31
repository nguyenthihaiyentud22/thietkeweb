function randomValue() {
    return Math.floor(Math.random() * 10) + 1; // Trả về số ngẫu nhiên từ 1 đến 10
}

function checkGuess() {
    var randomNumber = randomValue();
    var guessedNumber = parseInt(document.getElementById("userGuess").value);

    while (isNaN(guessedNumber) || guessedNumber < 1 || guessedNumber > 10) {
        guessedNumber = parseInt(prompt("Vui lòng nhập một số từ 1 đến 10."));
    }

    if (guessedNumber === randomNumber) {
        document.getElementById("result").innerText = "Chúc mừng! Bạn đã đoán đúng số.";
    } else {
        document.getElementById("result").innerText = "Số bạn đoán không đúng. Vui lòng thử lại.";
    }
}