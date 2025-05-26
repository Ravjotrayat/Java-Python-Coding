# Running Sum of 1d Array
class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        total=nums[0]
        for i in range(1,len(nums)):
            nums[i]+=total
            total=nums[i]
        return nums
        
def main():
    nums=[1,2,3,4]
    solution=Solution()
    result=solution.runningSum(nums)
    print(result)
    
if __name__ == "__main__":
    main()