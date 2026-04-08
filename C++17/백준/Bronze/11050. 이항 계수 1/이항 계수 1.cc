#include <iostream>
using namespace std;

long long factorial (int num) {
    if (num <= 1) return 1;
    return num * factorial (num - 1);
}

int main () {
    int n, k;
    cin >> n >> k;
    
    long long n_fac = factorial(n);
    long long k_fac = factorial(k);
    long long total_fac = factorial(n - k);
    
    long long result = n_fac / (k_fac * total_fac);
    
    cout << result;
    
    return 0;
}