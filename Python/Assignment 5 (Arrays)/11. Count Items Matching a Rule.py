# Count Items Matching a Rule
class Solution(object):
   def countMatches(self, items, ruleKey, ruleValue):
        """
        :type items: List[List[str]]
        :type ruleKey: str
        :type ruleValue: str
        :rtype: int
        """
        if ruleKey=="type":
            j=0
        elif ruleKey=="color":
            j=1 
        else:
            j=2
        count=0

        for i in items:
            if i[j]==ruleValue:
                count+=1
        return count
        
def main():
   
    solution=Solution()
    items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]]
    ruleKey = "type"
    ruleValue = "phone"
    result=solution.countMatches(items,ruleKey,ruleValue)
    print(result)
    
if __name__ == "__main__":
    main()