
def leap_year(a):
    if a%400==0:
        return True
    elif a%100==0:
        return False
    elif a%4==0:
        return True
    else:
        return False      
year=int(input("Enter the year"))
print(year,"is a Leap year ?",leap_year(year))