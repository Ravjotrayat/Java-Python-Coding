#  Kids With the Greatest Number of Candies
class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        maxx=max(candies)
        print(maxx)
        value=[False]*len(candies)
        for i in range(0,len(candies)):
            value[i]=candies[i]+extraCandies>=maxx
            
        return value
        
def main():
   
    solution=Solution()
    candies=[2,3,5,1,3]
    extraCandies =3
    result=solution.kidsWithCandies(candies,extraCandies)
    print(result)
    
if __name__ == "__main__":
    main()