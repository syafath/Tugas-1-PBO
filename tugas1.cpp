#include <iostream>
using namespace std;

int main(){
	int handphone;
	
	int k=0;
    do {
        cout << "_";
        k++;
    }
    while(k<=42);
    cout << "\n|          Program Data Handphone         |" << endl;
    int l=0;
    while(l<=42){
        cout << "_";
        l++;
    }
	cout << endl;
	cout << "Banyak data yang akan dimasukkan : ";
	cin >> handphone;
	cout << endl;
	
	string data[handphone][3];
	cout << "Masukkan data Handphone: " << endl;
	for (int i=0; i<handphone; i++){
        cout << endl;
        cout << "Data ke-" << i+1 << endl;
        for (int j=0; j<3; j++){
            if (j==0){
                cout << "Merek Handphone : ";
            }
            else if(j==1){
                cout << "Asal Negara : ";
            }
            else {
                cout << "Sistem Operasi : ";
            }
            cin >> data[i][j];
        }
    }
    
    cout << "---------------------------" << endl;
    cout << "\nDATA HANDPHONE " << endl;
    cout << "---------------------------" << endl;
    cout << "NIM \t\t NAMA \t\t Kelas \t" << endl;
    for(int i=0; i<handphone; i++) {
        for (int j=0; j<3; j++){
                cout << data[i][j] << "\t\t";
        }
        cout << endl;
    }
	
	return 0;
}
