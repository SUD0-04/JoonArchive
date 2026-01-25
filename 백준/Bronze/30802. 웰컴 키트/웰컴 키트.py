import sys

num = int(input())
data = list(map(int, sys.stdin.readline().split()))
T, P = map(int, input().split())

total_t_bundles = 0
for size in data:
    if size > 0:
        if size % T == 0:
            total_t_bundles += size // T
        else:
            total_t_bundles += (size // T) + 1
    else:
        total_t_bundles += 0

print(total_t_bundles)

result_a = num // P
result_b = num % P
print(result_a, result_b)