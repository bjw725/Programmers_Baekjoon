import sys
input = sys.stdin.readline

def dfs(c):
    ans_dfs.append(c) #방문 노드추가
    visited[c] = 1          # 방문 표시

    for n in graph[c]:
        if not visited[n]:    #방문하지 않은 노드인 경우
            dfs(n)

def bfs(s):
    q = []          #필요한 q, v[], 변수 생성
    q.append(s)     #q에 초기데이터 삽입
    ans_bfs.append(s)
    visited[s] = 1

    while q:
        c = q.pop(0)
        for n in graph[c]:
            if not visited[n]:
                q.append(n)
                ans_bfs.append(n)
                visited[n] = 1


n, m, v = map(int, input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(1, n+1):
    graph[i].sort()

visited = [0] * (n+1)
ans_dfs = []
dfs(v)

visited = [0] * (n+1)
ans_bfs = []
bfs(v)

print(*ans_dfs)
print(*ans_bfs)
