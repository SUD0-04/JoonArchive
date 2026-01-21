import sys

N, M = map(int, sys.stdin.readline().split())

matrix_A = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
matrix_B = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

for i in range(N):
    for j in range(M):
        print(matrix_A[i][j] + matrix_B[i][j], end=" ")
    print()