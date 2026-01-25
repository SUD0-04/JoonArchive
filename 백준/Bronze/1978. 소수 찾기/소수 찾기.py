import math

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            return False
    return True

N = int(input())
data = list(map(int, input().split()))

count = 0
for x in data:
    if is_prime(x):
        count += 1

print(count)