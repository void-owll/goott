input_number = int(input())
number = input_number
cycle = 0
while True:
    if number < 10 :
        input1 = 0
        input2 = number
        sum = input2
    elif number == 0:
        break
    else :
        input1 = number // 10
        input2 = number % 10
        sum = input1 + input2 
    
    cycle += 1

    number = (input2*10) + (sum%10)
    if number == input_number:
        break
print(cycle)    