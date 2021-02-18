/*
 * date.h
 *
 *  Created on: 2 f�vr. 2021
 *      Author: laari
 */

#ifndef DATE_H_
#define DATE_H_

#include <iostream>
#include <string>
using namespace std;

class date {
private:
	int jour;
	int mois;
	int annee;
	
public:
	date();
	date(int a, int b, int c);
	virtual ~date();
	bool compareTo(date d); //type de retour  nom de fonction (argument);
	void incrementer();
	string afficher() const;
	void lire() ;
    date& Incrementer();

    //Surcharge interne
    date& operator++();  //type de retour& nom de fonction (argument); &是adresse de memoire.
    //bool operator==(date const& d1);

    //Surcharge externe
    friend bool operator==(date d1, date d2);  //friend表示是externe，（）内要有两个argument
    friend ostream& operator<<(ostream& sortie, const date& y); //ostream 是afficher 了flou
};

#endif /* DATE_H_ */
