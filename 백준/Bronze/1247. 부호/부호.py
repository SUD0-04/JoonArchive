import sys

for _ in range(3):
    data = int(sys.stdin.readline())
    
    S = 0
    
    for _ in range(data):
        S += int(sys.stdin.readline())
    
    if S == 0:
        print("0")
    elif S > 0:
        print("+")
    else:
        print("-")