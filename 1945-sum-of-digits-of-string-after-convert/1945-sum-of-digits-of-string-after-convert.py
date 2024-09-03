class Solution:
    def getLucky(self, s: str, k: int) -> int:
        def giveDigitsSum(n):
            data = 0
            while n >0:
                data+= n%10
                n//=10
            return data
        number = ""
        for i in s:
            number += str (( ord(i) - 97 + 1))
        number = int(number)
        for _ in range(k):
            number = giveDigitsSum(number)
        return number


        