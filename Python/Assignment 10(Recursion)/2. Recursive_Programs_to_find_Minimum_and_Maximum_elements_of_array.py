class Solution(object):
    
    def find_minimum(self,array,n):
        if n==1:
            return array[0]
        
        minResult= self.find_minimum(array, n-1)
        if array[n-1]<minResult:
            minResult= array[n-1]

        return minResult
    
    def find_maximum(self,array,n):

        if n==1:
            return array[0]
        
        maxResult=self.find_maximum(array,n-1)
        if(array[n-1]>maxResult):
            maxResult=array[n-1]
        return maxResult

def main():
    solution=Solution()
    array=[8,2,3,4,5]
    result1=solution.find_minimum(array,len(array))
    result2=solution.find_maximum(array,len(array))
    print("Minimum:", result1 )
    print("Maximum:", result2)

if __name__=="__main__":
    main()