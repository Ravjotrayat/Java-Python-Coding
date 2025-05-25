# Concatenation of Array

class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[None]*(len(nums)*2)
        for i in range(0,len(nums)):
            l[i]=nums[i]
            l[i+len(nums)]=nums[i]
        return l
        
def main():
    nums=[1,2,3,1]
    solution=Solution()
    result=solution.getConcatenation(nums)
    print(result)
if __name__ == "__main__":
    main()

    