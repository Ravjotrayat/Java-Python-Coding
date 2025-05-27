class Solution:
    def Armstrong_number(self,x,y):
        l=[]
        if x>y:
            x,y=y,x
        for i in range(x,y+1):
            total=0
            copy=i
            while i>0:
                total+=(i%10)**3
                i//=10
            if total==copy:
                l.append(copy)
        return l

def main():
    a=int(input("Enter the value 1\n"))
    b=int(input("Enter the value 2\n"))
    solution=Solution()
    result=solution.Armstrong_number(a,b)
    print(result)

if __name__=="__main__":
    main()