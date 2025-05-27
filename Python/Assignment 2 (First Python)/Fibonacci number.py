class Solution:
    def Fibonacci(self,n):
        a=0
        b=1
        sum=0
        l=[]
        l.append(a)
        l.append(b)
        for i in range(1,n-1):
            sum=a+b
            l.append(sum)
            a,b=b,sum
        return l
def main():
    solution=Solution()
    n=int(input("Enter limit\n"))
    result=solution.Fibonacci(n)
    print(result)

if __name__=="__main__":
    main()