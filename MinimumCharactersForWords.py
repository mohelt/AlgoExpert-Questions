def minimumCharactersForWords(words):
    hashmap = {}
    for word in words:
        characterFreq =countCharFreq(word)
        updateMax(characterFreq,hashmap)

    return makeArray(hashmap)
def countCharFreq(string):
    charFreq = {}
    for char in string:
        if char not in charFreq:
            charFreq[char] = 0
        charFreq[char] +=1
    return charFreq  

def updateMax(freqs,maxfreq):
    for char in freqs:
        freq = freqs[char]
        if char in maxfreq:
            maxfreq[char] = max(freq,maxfreq[char])
        else:
            maxfreq[char] = freq

def makeArray(hashmap):
    chars = []

    for char in hashmap:
        freq = hashmap[char]

        for _ in range(freq):
            chars.append(char)
    return chars