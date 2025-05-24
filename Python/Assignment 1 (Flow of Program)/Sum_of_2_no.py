num1=input("Enter first number\n").strip()
num1= float(num1) if '.' in num1 else int(num1)

num2=input("Enter second number\n")
num2= float(num2) if '.' in num2 else int(num2)

result=num1+num2
print(result)