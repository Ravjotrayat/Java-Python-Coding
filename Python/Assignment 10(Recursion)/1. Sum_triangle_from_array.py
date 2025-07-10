class Solution(object):
    def sum_triangle_from_array(self,array):
        
        if len(array)<1:
            return

        l=[0]*(len(array)-1)
        for i in range(0,len(array)-1):
            l[i]=array[i]+array[i+1]

        self.sum_triangle_from_array(l)

        print(array)
        

def main():
    array=[8,2,3,4,5]
    solution=Solution()
    solution.sum_triangle_from_array(array)

if __name__=="__main__":
    main()
