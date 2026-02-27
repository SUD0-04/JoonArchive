#include <iostream>
#include <string>

using namespace std;

int main (void) {
    string str;
    cin >> str;
    

    if (str == "NLCS") {
        cout << "North London Collegiate School" << endl;
    } else if (str == "BHA") {
        cout << "Branksome Hall Asia" << endl;
    } else if (str == "KIS") {
        cout << "Korea International School" << endl;
    } else if (str == "SJA") {
        cout << "St. Johnsbury Academy" << endl;
    }
    
    return 0;
}