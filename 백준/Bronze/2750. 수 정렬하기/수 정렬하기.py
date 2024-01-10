n = int(input())
numList = []

for i in range(n):
    data = int(input())
    numList.append(data)
numList.sort()

for i in numList:
    print(i)