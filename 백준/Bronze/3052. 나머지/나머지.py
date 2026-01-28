result_data = []

for _ in range(10):
    data = int(input())
    result_data.append(data%42)
    
print(len(set(result_data)))