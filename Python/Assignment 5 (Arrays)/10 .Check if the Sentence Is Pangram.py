# Check if the Sentence Is Pangram
class Solution(object):
   def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        if len(sentence)<26:
            return False
        else:
            l=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
            for i in range(0,26):
                if l[i] in sentence:
                    continue
                else:
                    return False                   
        
        return True
        
def main():
   
    solution=Solution()
    sentence = "thequickbrownfoxjumpsoverthelazydog"
    # sentence = "leetcode"  answer will be false
    result=solution.checkIfPangram(sentence)
    print(result)
    
if __name__ == "__main__":
    main()