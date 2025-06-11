#  How Many Numbers Are Smaller Than the Current Number
class Solution(object):
   def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        count=[0]*102
        result=[]

        for i in nums:
            count[i]+=1

        for i in range(1,len(count)):
            count[i]+=count[i-1]

        for i in range(0,len(nums)):
            if nums[i]==0:
                result.append(0)
            else:
                result.append(count[nums[i]-1])
        return result
        
def main():
   
    solution=Solution()
    nums=[6,5,4,8]
    result=solution.smallerNumbersThanCurrent(nums)
    print(result)
    
if __name__ == "__main__":
    main()