def getPermutations(array):
    permuations = []
    helper(array,[],permuations)
    return permuations
    
def helper(arr,perm,perms):
    if not len(arr) and len(perm):
        perms.append(perm)
    else:
        for i in range(len(arr)):
            newArr=arr[:i] + arr[i+1:]
            newPerm = perm + [arr[i]]
            helper(newArr,newPerm,perms)
            
