case = int(input())

for _ in range(case):
    H,W,N = map(int, input().split())
    floor = N % H
    room_line = (N // H) + 1
    
    if floor == 0:
        floor = H
        room_line = N // H
        
    print(f"{floor}{room_line:02d}")