const prompt = require("prompt-sync")();
let leftOperand = Number(prompt("First number: "));
console.log();
let operator = prompt("+, -, *, /: "); 
console.log();
let rightOperand = Number(prompt("Second number: ")); 

let ans;

switch(operator) {
	case "+": ans = leftOperand + rightOperand; 
		console.log(`${leftOperand} + ${rightOperand} is ${ans}`); break; 
		
	case "-": ans = leftOperand - rightOperand;
		console.log(`${leftOperand} - ${rightOperand} is ${ans}`); break;
		
	case "*": ans = leftOperand * rightOperand; 
		console.log(`${leftOperand} * ${rightOperand} is ${ans}`); break;
		
	case "/": ans = leftOperand / rightOperand;
		console.log(`${leftOperand} / ${rightOperand} is ${ans}`); break;
		
	default: console.log(NaN);
}