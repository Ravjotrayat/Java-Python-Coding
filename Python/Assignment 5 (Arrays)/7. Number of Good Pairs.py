#  Number of Good Pairs
class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=[0]*101
        pairs=0
        for i in range(0,len(nums)):
            l[nums[i]]+=1
        
        for j in l:
            pairs+=(j*(j-1))/2
        return pairs
        
def main():
   
    solution=Solution()
    nums=[1,2,3,1,1,3]
    result=solution.numIdenticalPairs(nums)
    print(int(result))
    
if __name__ == "__main__":
    main()