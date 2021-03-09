//============================================================================
// Name        : devoir.cpp
// Author      : chengwanli Yang
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <fstream>
#include <regex>
using namespace std;
/*
 * exercice 8c)
 */

void renvoieNbreE(string str){
	int n=0;
	smatch result;
	regex pattern("e");

	if (regex_match(str, result, pattern))
	{
		n=n+1;
	}
	cout << "Il y a "<< n <<" 'e' dans cette phrase." << endl;
}
int main() {
	renvoieNbreE("ebebeahabe bee ebah");
	return 0;
}
/*
 * Dans cette fonction, je pense que le regex pattern("e") est correct, je ne comprends pas pourquoi il envoie 0 'e' dans le résultat.
 */
