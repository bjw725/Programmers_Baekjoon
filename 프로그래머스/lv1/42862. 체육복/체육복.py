def solution(n, lost, reserve):
    setLost = set(lost) - set(reserve)
    setRes = set(reserve) - set(lost)
    
    for i in setRes:
        if i-1 in setLost:
            setLost.remove(i-1)
        elif i+1 in setLost:
            setLost.remove(i+1)
    return n-len(setLost)