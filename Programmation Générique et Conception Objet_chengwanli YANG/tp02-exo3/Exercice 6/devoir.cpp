//============================================================================
// Name        : devoir.cpp
// Author      : chengwanli Yang
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "devoir.h"
/*
 * exercice 6
 */

void renvoieNbreTokens(string nomFichier){
	ifstream fluxSortie;

	fluxSortie.open(nomFichier, ios_base::in);  //ouvrir le ficher
	if (fluxSortie.fail())
		cerr<<"impossible de lire le fichier";
	else{
		int n=0;
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
		int taille = n;     //créer un tableau, taille comme nombre de mot
		short tab[taille];
		for(int i = 0; i < taille; i++) {
			cin >> tab[i];  //ajouter des mots dans le tableau
		}

		cout<<"Il y a "<<n<<" mots."<<endl;
	}
	fluxSortie.close();
}


