N, r, c = map(int, input().split())
visit = 0
while N != 0:
    N -= 1
    size = 2**N
    if r < size and c < size:
        visit += 0
    elif r < size and c >= size:
        visit += size * size
        c -= size
    elif r >= size and c < size:
        visit += size * size * 2
        r -= size
    else:
        visit += size * size * 3
        r -= size
        c -= size
        
print(visit)