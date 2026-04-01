#include <iostream>
using namespace std;

int main () {
    for (int i = 0; i < 3; i++) {
        int total = 0;
        
        for (int j = 0; j < 4; j++) {
            int yut;
            cin >> yut;
            
            total += yut;
        }
        
        if (total == 3)
                cout << "A" << endl;
            else if (total == 2)
                cout << "B" << endl;
            else if (total == 1)
                cout << "C" << endl;
            else if (total == 0)
                cout << "D" << endl;
            else
                cout << "E" << endl;
    }
    
    return 0;
}