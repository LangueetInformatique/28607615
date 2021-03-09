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
#include <sstream>
using namespace std;

void CompterMots(string nomFichier){
	ifstream fluxSortie;

	fluxSortie.open(nomFichier, ios_base::in);   //ouvrir le ficher
	if (fluxSortie.fail())
		cerr<<"impossible de lire le fichier";
	else{
		int n=0;
		string phrase;
		while (!fluxSortie.eof()) {
		getline(fluxSortie, phrase);    //lire le ficher par ligne
		}
		istringstream is(phrase);	//lire des Caractère
		string s;
		while(is>>s)				//faire une boucle pour compter le nombre
		{
		 n=n+1;
		}
		 cout<<"Il y a "<<n<<" mots."<<endl;
	}
	fluxSortie.close();

}

int main() {

	CompterMots("Adelaide.txt");

	return 0;
}

