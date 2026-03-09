#include <iostream>
#include <string>
using namespace std;

int main (void) {
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int p;
        cin >> p;
        
        string top_plr = "";
        long long max_price = -1;
        
        for (int j = 0; j < p; j++) {
            long long price;
            string name;
            cin >> price >> name;
            
            if (price > max_price) {
                max_price = price;
                top_plr = name;
            }
        }
        cout << top_plr << endl;
    }
    
    return 0;
}