//============================================================================
// Name        : devoir.cpp
// Author      : chengwanli Yang
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "devoir.h"
/*
 * exercice 8e)
 */

void dic(string str){
	regex reg("\\w");  //le regex pour découper le string par caractère
	int n=0;

	sregex_token_iterator iter(str.begin(), str.end(), reg, -1);

	sregex_token_iterator end;

	vector<string> vec(iter, end);    //obtenir des caractères

	map<int, string> variable_glo ;   //créer un dictionnaire

	for (auto a : vec)				// pour chaque caractère

	{
		variable_glo[n] = a;			  //clé n (à partir de 0), valeur a prend la caractère
		n=n+1;
	}

}

