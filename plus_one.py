from typing import List
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        st=[]
        for i in digits:
            st.append(str(i))
        num = int("".join(st))+1
        li = list(str(num))
        li2=[]
        for i in li:
            li2.append(int(i))
        return li2