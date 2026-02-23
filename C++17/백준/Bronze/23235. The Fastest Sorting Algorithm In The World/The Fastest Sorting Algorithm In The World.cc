#include <iostream>
#include <string>

using namespace std;

int main (void) {
    int n, count = 1;

    while (true) {
        cin >> n;
        if (n == 0) break;

        for (int i = 0; i < n; i++) {
            int temp;
            cin >> temp;
        }

        cout << "Case " << count << ": Sorting... done!" << endl;
        count++;
    }

    return 0;
}