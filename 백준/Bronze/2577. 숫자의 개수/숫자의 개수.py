import math
import sys

data = []

for _ in range(3):
    num = int(sys.stdin.readline())
    data.append(num)

result = math.prod(data) 
str_result = str(result)
    
for i in range(10):
    print(str_result.count(str(i)))