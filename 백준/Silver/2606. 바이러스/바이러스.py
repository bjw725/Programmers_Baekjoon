def dfs(c):
    global ans
    ans += 1
    v[c] = 1
    for n in arr[c]:
        if not v[n]:
            dfs(n)

n = int(input())
m = int(input())
arr = [[] for _ in range(n+1)]
for _ in range(m):
    x, y = map(int, input().split())
    arr[x].append(y)
    arr[y].append(x)
    
ans = 0
v = [0]*(n+1)
dfs(1)
print(ans-1)