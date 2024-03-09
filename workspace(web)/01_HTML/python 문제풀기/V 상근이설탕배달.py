##설탕배달하기
##3킬로그램, 5킬로그램 봉지가 있는데
##입력된 수량의 설탕을 배달하기 위한
##최대한 적은 봉지 수를 구하기

sugar = int(input())
sugar5 = 0
sugar3 = 0


if sugar == 4 :
    sugar3 = 0
elif sugar == 7 :
    sugar3 = 2
elif sugar % 5 == 0 :
    sugar3 = 0
elif sugar % 5 == 1 :
    sugar3 = 2
elif sugar % 5 == 2 :
    sugar3 = 4
elif sugar % 5 == 3 :
    sugar3 = 1
elif sugar % 5 == 4 :
    sugar3 = 3

remain_sugar = sugar-(sugar3 * 3)

if remain_sugar % 5 == 0 :
    sugar5 = remain_sugar//5
    print(sugar5 + sugar3)
else :
    print(-1)
