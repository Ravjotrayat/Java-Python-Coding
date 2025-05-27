class Solution:
    def palindrome(self,s):
        s=s.strip()

        # Slicing ==> s[start : stop : step]
        # 1.) ss=s[len(s)::-1]
        # 2.) ss=s[::-1]
        ss=s[::-1]
        print(ss)
        if s==ss:
            return True
        return False

def main():
    a=input("Enter the string \n")
    solution=Solution()
    result=solution.palindrome(a)
    print(result)

if __name__=="__main__":
    main()