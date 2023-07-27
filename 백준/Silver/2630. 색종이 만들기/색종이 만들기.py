n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]
white, blue = 0,0

def dfs(x, y, n):
    check = board[x][y]
    global white, blue
    for i in range(x, x + n):
        for j in range(y, y + n):
            if check != board[i][j]:
                check = -1
                break
    if check == -1:
        dfs(x, y, n//2)
        dfs(x, y + n//2, n//2)
        dfs(x + n//2, y, n//2)
        dfs(x + n//2, y + n//2, n//2)
    elif check == 1:
        blue += 1
    else:
        white += 1


dfs(0, 0, n)
print(white)
print(blue)