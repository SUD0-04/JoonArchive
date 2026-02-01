import sys

while True:
    line = sys.stdin.readline()
    
    if not line:
        break
        
    S, N = map(int, line.split())
    
    print(N // (S + 1))