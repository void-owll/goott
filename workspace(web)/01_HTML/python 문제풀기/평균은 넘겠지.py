testcase = int(input())
for _ in range(testcase):
        
    scores = list(map(int,input().split()))
    print(type(scores))
    for element in scores:
        print(element)
    student = int(scores[0])
    scores.remove(student)

    sum = 0
    count = 0
    for score in scores :
        sum += score
    average = sum/student
    for score in scores :
        if score > average :
            count += 1
            print(score)
    print(average)
    print(f"{count/student*100}%")
