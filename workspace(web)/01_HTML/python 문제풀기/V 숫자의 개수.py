A = int(input())
B = int(input())
C= int(input())

result = list(str(A*B*C))
count = {}

for j in range(10):
    count[int(j)] = 0
for i in result:
    count[int(i)] += 1

result1 = sorted(count.items(), key= lambda x : x[0])
for i, j in result1 :
    print(j)

## 밸류 에러 뜸;