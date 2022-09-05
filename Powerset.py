def powerset(array):
    permuations = [[]]
    for element in array:
        for i in range(len(permuations)):
            currentSubset = permuations[i]
            permuations.append(currentSubset + [element])
    return permuations