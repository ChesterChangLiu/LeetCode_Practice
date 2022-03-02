class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        fTable = {char: 0 for char in 'balon'}
        for char in text:
            if char in fTable:
                fTable[char] += 1
        fTable['l'] = fTable['l']//2
        fTable['o'] = fTable['o']//2

        return min(fTable.values())
