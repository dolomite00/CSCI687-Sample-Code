def swap(num1, num2):
    # print(id(num1))
    # print(id(num2))
    temp = num1
    num1 = num2
    num2 = temp
    # print(id(num1))
    # print(id(num2))


a = 1
b = 2
# print(id(a))
# print(id(b))
print("Before swap: a = ", a)
print("Before swap: b = ", b)
swap(a, b)
print("After swap: a = ", a)
print("After swap: b = ", b)
# print(id(a))
# print(id(b))
