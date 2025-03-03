class Solution:
    def trap(self, height: List[int]) -> int:
        # left max, right max
        n = len(height) 
        
        leftMax = [0] * n
        leftMax[0] = height[0]
        for index,element in enumerate(height[1:], start=1):
            leftMax[index] = max(leftMax[index-1], element)
            

       

        r = len(height)-2
        rightMax = [height[-1]]
        li = 0
        while r>=0:
              if height[r] > rightMax[li]:
                 rightMax.append(height[r])
              else:
                 rightMax.append(rightMax[li])
              r-=1
              li+=1


        water = 0
        rightMax.reverse()
        print(leftMax)
        print(rightMax)
        for i in range(len(height)):
              local = min(leftMax[i],rightMax[i]) - height[i]
              water  +=local
        return water
              
        