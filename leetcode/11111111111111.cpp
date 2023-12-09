/**************************

/***         9-???????                  ********/

#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

class Tab{
	string t_name;
	string t_prod;
    int t_sani;
	int t_baa;
    public:
    Tab(string name, string prod, int sani, int baa){
        t_name = name;
       t_prod = prod;
         t_sani = sani;
        t_baa = baa; 
    }
     string getname() { return t_name; } 
     string getprod() { return t_prod; } 
     int getsani() { return t_sani; } 
     int getbaa() { return t_baa; } 
    
};


int main() {
	setlocale(LC_ALL, "Russian");
    Tab str1 = { "Office", " Microsoft", 4, 870 };
	Tab str2 = { "SmartSute", " Lotus", 5, 1020 };
	Tab str3 = { "SmartOffice", " Sun", 4, 9 };
    Tab arr[]={str1, str2, str3};

    cout << "-----------------------------------------------------------------" << endl;
	cout << "|???? ?????????                                                  |" << endl;
	cout << "|----------------------------------------------------------------|" << endl;
	cout << "| " << setw(19) << left << "???????" << "|" << setw(22) << left << " ?????????" << "|" << left << setw(10) << "??????????? ????" << "|" << left << setw(24) <<   "?????($)" << "|" << endl;;

for (auto elem : arr) {
		cout << "|----------------------------------------------------------------|" << endl;
		cout << "| " << setw(12) << elem.getname() << "|" << setw(13) << elem.getprod() << "|" << setw(16) << elem.getsani() << "|" << setw(19) << elem.getbaa() << "|" << endl;
	}

	cout << "|----------------------------------------------------------------|" << endl;
	cout << "|????????:Internet ??????? SmartOffice ??????? ?????? ???? ?????.|" << endl;
	cout << "-----------------------------------------------------------------" << endl;
	return 0;

}
