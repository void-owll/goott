number = int(input("숫자 입력 : "))

blocks = number
count = 1
if number == 1 :
    p = 0
else :
    p = 1
while blocks >= 1:
    blocks = blocks - (count * 6)
    blocks = int(blocks)
    count = count + 1
    p = p+1
print(p)
