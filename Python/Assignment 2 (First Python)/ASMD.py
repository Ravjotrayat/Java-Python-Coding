#Take in two numbers and an operator (+, -, *, /) and 
#calculate the value.

a=int(input("Enter the first number\n"))
b=int(input("Enter the second number\n"))

choice=input("Enter +, -, * or / \n")
if choice=='+':
    print("Addition of 2 numbers is :",a+b)
elif choice=='-':
    print("Subtraction of 2 numbers is :",max(a,b)-min(a,b))
elif choice=='*':
    print("Multiplication of 2 numbers is :",a*b)
elif choice =='/':
    print("Division of 2 numbers is :",int(max(a,b)/min(a,b)))
else:
    print("Invalid input")

