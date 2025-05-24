def Sum_till_x():
    total=0
    while True:
        num=input("Enter the number to add or x to exit\n").strip()
        if num=='x' or num=='X':
            print(total)
            break
        num = float(num) if '.' in num else int(num) 
        total+=num

Sum_till_x()
    

