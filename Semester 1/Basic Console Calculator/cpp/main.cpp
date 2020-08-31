#include <iostream>
#include <string>

int main(){
  bool bLoop = true;
  double num1, num2, output;
  char op = ' ';
  std::string input;
  // Prints a welcome statement to the console
  std::cout << "Welcome to this consle calculator app!\n";
  while (bLoop){
    // Asks user for first number and saves the input as a numeric variable
    std::cout << "Please input the first number\n";
    std::cin >> num1;

    // Asks user for an operator ( +, -, *, or /)
    std::cout << "Please input the operator\n";
    std::cin >> op;

    // Asks user for second number and saves the input as a numeric variable
    std::cout << "Please input the second number\n";
    std::cin >> num2;

    // calculation
    switch (op){
      case '+':
        output = num1 + num2;
        break;
      case '-':
        output = num1 - num2;
        break;
      case '*':
        output = num1 * num2;
        break;
      case '/':
        output = num1 / num2;
        break;
      default:
        std::cout << "ERROR: Invalid operator. Output set to 0 (default)\n\n";
        output = 0;
        break;
    }

    // Prints the answer in the console
    std::cout << "Your function is: " << num1 << ' ' << op << ' ' << num2 << '\n';
    std::cout << "The answer is: " << output << '\n';

    // Asks user if they would like to perform another calculation
    std::cout << "Would you like to perform another calculation? (y/n)\n";
  }
  return 0;
}
