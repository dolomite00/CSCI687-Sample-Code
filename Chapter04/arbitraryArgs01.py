def avarage(arg, *args):
    result = sum(args) + arg
    count = len(args) + 1
    return result / count


print(avarage(10, 3, 6))
print(avarage(10))

# def avarage(*args):
#     result = sum(args)
#     count = len(args)
#     return result / count


# print(avarage(10, 3, 6))
# print(avarage())
