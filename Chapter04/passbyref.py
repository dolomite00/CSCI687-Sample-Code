a = [1]
b = [2]


def swap(num1, num2):
    temp = num1[0]
    num1[0] = num2[0]
    num2[0] = temp


print("Before swap: a = ", a)
print("Before swap: b = ", b)
swap(a, b)
print("After swap: a = ", a)
print("After swap: b = ", b)
