//============================================================================
// Name        : TP3_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
#include "date.h"
using namespace std;

int main() {
	date a(25,2,2021) ;
	date b(25,12,2021) ;

	//if (a.compareTo(b) == true)
	if (a==b) 
		cout<< "Identiques" << endl;
	else
		cout << "Differents" << endl ;

	a.incrementer();
	cout << a.afficher() << endl ;
	a=a.Incrementer();
	cout << a.afficher() << endl ;
	++a;  //incrementer
	cout << a.afficher() << endl;


	return 0;
}
