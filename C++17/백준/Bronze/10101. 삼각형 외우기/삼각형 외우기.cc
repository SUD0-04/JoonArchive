#include <iostream>
using namespace std;

int main () {
    int arr[3];
    int total = 0;
    
    for (int i = 0; i < 3; i++) {
        cin >> arr[i];
        
        total += arr[i];
    }
    
    if (total == 180 && (arr[0] == arr[1] && arr[1] == arr[2]))
        cout << "Equilateral";
    else if (total == 180 && (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]))
        cout << "Isosceles";
    else if (total == 180 &&(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0]))
        cout << "Scalene";
    else
        cout << "Error";
    
    return 0;
}