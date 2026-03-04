#include <iostream>
#include <string>
using namespace std;

int main (void) {
    string str;
    cin >> str;
    
    if (str == "M") {
        cout << "MatKor";
    } else if (str == "W") {
        cout << "WiCys";
    } else if (str == "A") {
        cout << "AlKor";
    } else if (str == "$") {
        cout << "$clear";
    } else {
        cout << "CyKor";
    }
    
    return 0;
}