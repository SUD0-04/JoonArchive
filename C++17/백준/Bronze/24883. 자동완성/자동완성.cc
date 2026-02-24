#include <iostream>
using namespace std;

int main (void) {
    char Naver;
    
    cin >> Naver;
    
    if (Naver == 'N' || Naver == 'n') {
        cout << "Naver D2" << endl;
    } else {
        cout << "Naver Whale" << endl;
    }
    
    return 0;
}