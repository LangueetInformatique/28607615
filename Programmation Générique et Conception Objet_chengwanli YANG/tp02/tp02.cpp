//============================================================================
// Name        : tp02.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
using namespace std;

void verifier(string nomFichier,char* dateAnniv){
	ifstream fluxSortie;  //文件读操作
	fluxSortie.open(nomFichier, ios_base::in); //以读的方式打开文件
	if (fluxSortie.fail())
		cerr<<"impossible de lire le fichier";
	else{
		string dateAnnivFlux;
		getline(fluxSortie, dateAnnivFlux); //On lit une ligne complète
		if (dateAnniv==dateAnnivFlux)
			cout<<"Le fichier a récupéré la bonne date";
		else
			cout <<"Les dates ne se correspondent pas, vous aviez introduit dans le fichier : "<<dateAnnivFlux;
	}
}


int main() {

	char s[100] ; //拟一个变量s 大小100
	cout << "Donner votre date de naissance" <<endl; //s是个变量
	cin.getline(s, 255); // Pour lire les espaces, cin 只读取空格前的内容， cin.getline读取一整行的内容
	cout << s << endl ;
	ofstream fluxEntree; //文件写的操作
	fluxEntree.open("Naissance.txt", ofstream::out); // ofstream::out 的意思 Fichier en écriture
	if (fluxEntree.fail()) //如果写文件失败
		cerr << "Impossible d'�crire dans le fichier\n";  //cerr 输出错误
	else {
		fluxEntree << s<<endl;  //成功的话 s写入fluxEntree
	}

	char d[100] ;
	cout<< "date a verifier"<< endl ;
	cin.getline(d, 255);
	verifier("Naissance.txt", d) ;

	return 0;
}

