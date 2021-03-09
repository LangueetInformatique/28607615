//============================================================================
// Name        : devoir.cpp
// Author      : chengwanli Yang
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "devoir.h"
/*
 * exercice 7
 */

void renvoieNbreTokens2(string nomFichier){
	ifstream fluxSortie;

	fluxSortie.open(nomFichier, ios_base::in);  //ouvrir le ficher
	if (fluxSortie.fail())
		cerr<<"impossible de lire le fichier";
	else{
		int n=0;                        //méthode 1
		string phrase;
		while (!fluxSortie.eof()) {
		getline(fluxSortie, phrase);  //lire le ficher par ligne
		}
		istringstream is(phrase);    //lire des Caractère
		string s;
		while(is>>s)
		{
		 n=n+1;
		}
		cout<<"Il y a "<<n<<" mots avec méthode 1."<<endl;



		    int m=0;
		    regex reg("[^0-9A-Za-z]");    //méthode 2


		    sregex_token_iterator iter(phrase.begin(), phrase.end(), reg, -1);

		    sregex_token_iterator end;

		    vector<string> vec(iter, end);

		    for (auto a : vec)

		    {
		    	m=m+1;
		    }
		    cout<<"Il y a "<<m<<" mots avec méthode 2."<<endl;
	     }



	fluxSortie.close();
}


