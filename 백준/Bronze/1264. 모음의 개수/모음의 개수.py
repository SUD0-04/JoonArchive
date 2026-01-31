import sys

while True:
    sentence = sys.stdin.readline().strip().lower()
    
    if sentence == "#":
        break
    
    vowels = "aeiou"
    count = 0
    
    for char in sentence:
        if char in vowels:
            count += 1

    print(count)