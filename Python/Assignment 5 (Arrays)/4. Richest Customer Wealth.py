# Richest Customer Wealth
class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        maxx=0;
        for i in accounts:
            total=sum(i)
            maxx=max(maxx,total)
        return maxx

        
def main():
    nums=[[1,5],[7,3],[3,5]]
    solution=Solution()
    result=solution.maximumWealth(nums)
    print(result)
    
if __name__ == "__main__":
    main()