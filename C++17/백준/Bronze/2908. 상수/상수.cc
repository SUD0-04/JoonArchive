#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main () {
    int n, m;
    cin >> n >> m;
    
    string sN = to_string(n);
    reverse(sN.begin(), sN.end());
    int resN = stoi(sN);
    
    string sM = to_string(m);
    reverse(sM.begin(), sM.end());
    int resM = stoi(sM);
    
    if (resN > resM) {
        cout << resN << endl;
    } else {
        cout << resM << endl;
    }
    
    return 0;
}