# Shuffle the Array
class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        array=[None]*len(nums)
        left=0
        right=n
        for i in range(0,len(array),2):
            array[i]=nums[left]
            array[i+1]=nums[right]
            left+=1
            right+=1
        return array
        
def main():
   
    solution=Solution()
    nums=[1,2,3,4,4,3,2,1]
    n=4
    result=solution.shuffle(nums,n)
    print(result)
    
if __name__ == "__main__":
    main()