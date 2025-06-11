# Find the Highest Altitude
class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        steps,maxx=0,0
        for i in range(0,len(gain)):
            steps+=gain[i]
            maxx=max(maxx,steps)
        return maxx
        
def main():
   
    solution=Solution()
    gain=[-4,-3,-2,-1,4,3,2]
    #Answer is 0
    result=solution.largestAltitude(gain)
    print(result)
    
if __name__ == "__main__":
    main()