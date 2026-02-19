#include <iostream>
using namespace std;

int main(void) {
    long long N;
    cin >> N;


    long long case1 = (N * 78) / 100;
    long long case2 = (N * 956) / 1000;

    cout << case1 << " " << case2 << endl;

    return 0;
}