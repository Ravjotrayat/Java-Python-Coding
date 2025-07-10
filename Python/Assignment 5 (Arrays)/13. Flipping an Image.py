class Solution(object):
    def flipAndInvertImage(self, image):
        """
        :type image: List[List[int]]
        :rtype: List[List[int]]
        """
        result=[]
        for i in image:
            temp=[]
            i=reversed(i)
            for j in i:
                if j==1:
                    temp.append(0)
                else:
                    temp.append(1)
            result.append(temp)
        return result

def main():
    solution=Solution()
    image=[[1,1,0],[1,0,1],[0,0,0]]
    # Answer is [[1,0,0],[0,1,0],[0,1,1]]
    result=solution.flipAndInvertImage(image)
    print(result)

if __name__=="__main__":
    main()