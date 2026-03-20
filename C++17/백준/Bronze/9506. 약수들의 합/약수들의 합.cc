#include <iostream>
#include <vector>
using namespace std;

int main() {
    while (true) {
        int num;
        cin >> num;
        if (num == -1) {
            break;
        }

        vector<int> arr;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                arr.push_back(i);
                sum += i;
            }
        }

        if (sum != num) {
            cout << num << " is NOT perfect." << endl;
            continue;
        }

        cout << num << " = ";
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                cout << arr[i] << endl;
            } else {
                cout << arr[i] << " + ";
            }
        }
    }
}