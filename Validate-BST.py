import math
# This is an input class. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def validateBst(tree):
    min = -math.inf
    max = math.inf
    return helper(tree,min,max)
def helper(tree,min,max):
    if tree is None:
        return True
    if tree.value < min or tree.value >= max:
        return False
    leftValid = helper(tree.left,min,tree.value)
    return leftValid and helper(tree.right,tree.value,max)