#include <iostream>
#include <string>
using namespace std;

int main(void) {
    int num;
    cin >> num;
    
    for (int i = 0; i < num; i++) {
        string cls;
        cin >> cls;
        
        if (cls == "Algorithm") cout << "204\n";
        else if (cls == "DataAnalysis") cout << "207\n";
        else if (cls == "ArtificialIntelligence") cout << "302\n";
        else if (cls == "CyberSecurity") cout << "B101\n";
        else if (cls == "Network") cout << "303\n";
        else if (cls == "Startup") cout << "501\n";
        else if (cls == "TestStrategy") cout << "105\n";
    }
    
    return 0;
}