class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x<0 else 1
        x = abs(x)
        c = 0
        while x!=0:
            ld = x%10
            c = c*10+ ld
            x = x//10
        c = sign*c
        if c<-2**31 or c>2**31 - 1:
            return 0
        return c
