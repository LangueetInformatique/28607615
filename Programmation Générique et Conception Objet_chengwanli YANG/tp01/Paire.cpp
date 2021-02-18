#include "Paire.h"

int main() {
	short n=0;
	cout << "entrer un entier" << endl;
	cin >> n;

	if (Parite(n)==true)
		cout << "entier paire" << endl;
	else
		cout << "entier impaire" << endl;

	return 0;
}
