#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    string oldestName, youngestName;
    long long oldestDate = 99999999; // 가장 나이 많은 사람을 찾기 위해 아주 큰 값으로 초기화
    long long youngestDate = 0;      // 가장 나이 적은 사람을 찾기 위해 아주 작은 값으로 초기화

    for (int i = 0; i < n; i++) {
        string name;
        int d, m, y;
        cin >> name >> d >> m >> y;

        long long currentDate = (long long)y * 10000 + m * 100 + d;

        if (currentDate < oldestDate) {
            oldestDate = currentDate;
            oldestName = name;
        }

        if (currentDate > youngestDate) {
            youngestDate = currentDate;
            youngestName = name;
        }
    }

    cout << youngestName << "\n";
    cout << oldestName << "\n";

    return 0;
}