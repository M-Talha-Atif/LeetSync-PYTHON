class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        data = []
        for index,i in enumerate(word):
            data.append(i)
            if i==ch:
               data.reverse()
               return "".join(data) + word[index+1::]
            
        return word
        