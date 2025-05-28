# Create Target Array in the Given Order
class Solution(object):
   def createTargetArray(self, nums,index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in range(0,len(nums)):
            l.insert(index[i],nums[i])
        return l
        
def main():
   
    solution=Solution()
    nums = [0,1,2,3,4]
    index = [0,1,2,2,1]
    result=solution.createTargetArray(nums,index)
    print(result)
    
if __name__ == "__main__":
    main()