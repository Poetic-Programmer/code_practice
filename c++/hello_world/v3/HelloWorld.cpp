// get user input, display personalised greeting

#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::string;

int main(){
	string name;

	cout << "What is your name? ";
	cin >> name;

	cout << "Hello " << name << ", its nice to meet you";
}
