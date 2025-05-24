class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        # array=[]
        # print(array)
        # for i in range(len(nums)):
        #     array.append(nums[nums[i]])

        return [nums[i] for i in nums]

def main():
    nums=[0,2,1,5,3,4]
    solution=Solution()
    result=solution.buildArray(nums)
    print("output Array:",result)

if __name__ == "__main__":
    main()