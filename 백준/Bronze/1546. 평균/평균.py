import sys

N = int(input())
scores = list(map(int, sys.stdin.readline().split()))

M = max(scores)
sum_scores = sum(scores)
result = (sum_scores / M * 100) / N

print(result)