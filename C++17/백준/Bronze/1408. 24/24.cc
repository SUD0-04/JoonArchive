#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main () {
    string s1, s2;
    cin >> s1 >> s2;

    int h1 = stoi(s1.substr(0, 2)), m1 = stoi(s1.substr(3, 2)), s1_sec = stoi(s1.substr(6, 2));
    int h2 = stoi(s2.substr(0, 2)), m2 = stoi(s2.substr(3, 2)), s2_sec = stoi(s2.substr(6, 2));

    int currentTotal = h1 * 3600 + m1 * 60 + s1_sec;
    int startTotal = h2 * 3600 + m2 * 60 + s2_sec;

    int diff = startTotal - currentTotal;

    if (diff < 0) {
        diff += 24 * 3600;
    }

    int h = diff / 3600;
    int m = (diff % 3600) / 60;
    int s = diff % 60;

    cout << setfill('0') << setw(2) << h << ":"
         << setfill('0') << setw(2) << m << ":"
         << setfill('0') << setw(2) << s << endl;

    return 0;
}