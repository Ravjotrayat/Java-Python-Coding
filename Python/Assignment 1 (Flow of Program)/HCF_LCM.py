# 1st way, brute-force method
def find_hcf(a,b):
    hcf=1
    for i in range(1,min(a,b)+1):
        #print(i)
        if a%i==0 and b%i==0:
            hcf=i
    return hcf

num1=int(input("Enter the number 1\n"))
num2=int(input("Enter the number 2\n"))
print("HCF of 2 numbers in Brute-force method:",find_hcf(num1,num2),"\n")

# 2nd way, RECURSION

def find_hcf2(a,b):

    if b==0:
        return a
    else:
       return find_hcf2(b,int(a%b))
    
num1=int(input("Enter the number 1\n"))
num2=int(input("Enter the number 2\n"))
print("HCF of 2 numbers in Recursive way:",find_hcf2(num1,num2))

#LCM of 2 numbers{lcm=(axb)/hcf }


def find_lcm(a,b):
    hcf=find_hcf2(a,b)
    return int((a*b)/hcf)

num1=int(input("Enter the number 1\n"))
num2=int(input("Enter the number 2\n"))
print("LCM of 2 numbers is:",find_lcm(num1,num2))