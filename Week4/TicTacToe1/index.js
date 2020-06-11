// const means the variable is constant and cannot be canged
// let means the variable is okay to change

// let i = 0;
// i = 1; // good

// const i = 0;
// i = 1; // bad

const game = {
	currentTurn: "X",
	board: ["", "", "", "", "", "", "", "", ""]
}

// game[board] === game.board

const winningCombos = [
	[0, 1, 2],
	[3, 4, 5],
	[6, 7, 8],
	[0, 4, 8],
	[2, 4, 6],
	[0, 3, 6],
	[1, 4, 7],
	[2, 5, 8]
]

function checkWinner() {
	const board = game['board'];
	return winningCombos.find(function(combo) {
		if (board[combo[0]] === "") {
			return false;
	}
		return board[combo[0]] === board[combo[1]] 
			&& board[combo[1]] === board[combo[2]]
	})
}

function addListener() {
	const board = document.querySelector('.board');
	board.addEventListener('click', function(event) {
		const square = Number(event.target.dataset['squareId'])
		const currentTurn = game['currentTurn'];
		
		// set the square to the players symbol
		game['board'][square] = currentTurn;
		
		// changes turn to next player 
		if (currentTurn === "X") {
			game['currentTurn'] = "O";
		} else {
			game['currentTurn'] = "X";
		}

		if (checkWinner()) {
			alert("Winner is " + currentTurn);
		}

		// TODO: check for a winner
		
		
		// display updated board
		displayBoard(game);
	})
}

const displayBoard = function(game) { // display board function has access to game
	document.querySelector('.target').innerHTML = "<div class='board'>" + // sets inner html of the target. the class is names board - for css
		"<div class='square' data-square-id='0'>" + game['board'][0] + "</div>" +
		"<div class='square' data-square-id='1'>" + game['board'][1] + "</div>" +
		"<div class='square' data-square-id='2'>" + game['board'][2] + "</div>" +
		"<div class='square' data-square-id='3'>" + game['board'][3] + "</div>" +
		"<div class='square' data-square-id='4'>" + game['board'][4] + "</div>" +
		"<div class='square' data-square-id='5'>" + game['board'][5] + "</div>" +
		"<div class='square' data-square-id='6'>" + game['board'][6] + "</div>" +
		"<div class='square' data-square-id='7'>" + game['board'][7] + "</div>" +
		"<div class='square' data-square-id='8'>" + game['board'][8] + "</div>" + // can >X</div> to put X on the ninth box
	"</div>"

	addListener();
}

displayBoard(game);