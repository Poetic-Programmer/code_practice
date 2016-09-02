// use functions to display a series of directions from point A to point B

#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::string;

enum Direction{
	LEFT,
	RIGHT,
	FORWARD,
	BACKWARD
};

void KeepGoing(int dist, Direction dir);
void Turn(int degrees, Direction dir);

int main(){
	Direction d;

	KeepGoing(5, Direction::FORWARD); 
	Turn(180, Direction::RIGHT);
	Turn(360, Direction::LEFT);
	KeepGoing(5, Direction::FORWARD);

	cout << "HaHa!";
}

void KeepGoing(int dist, Direction dir){
	cout << "walk " << dist << (dir == FORWARD ? 
			" Forward." : " hang on, you're walking funny!");
}

void Turn(int degrees, Direction dir){
	if(dir == LEFT || dir == RIGHT){
		cout << "turn " << degrees << " to your " << (dir == RIGHT ? " right." : "left");
	}
	else{
		cout << "you are going to fall";
	}
}



