from typing import List
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ds = []
        tf = [0]*len(nums)
        res = []

        def perm(nums,ds,tf,res):
            if len(nums) == len(ds):
                res.append(ds[:])
                return
            for i in range(len(nums)):

                if tf[i] == 0:
                    ds.append(nums[i])
                    tf[i] =1
                    perm(nums,ds,tf,res)
                    tf[i] = 0
                    ds.pop()
        perm(nums,ds,tf,res)
        return res

                
