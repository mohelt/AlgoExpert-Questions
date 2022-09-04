# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def findKthLargestValueInBst(tree, k):
    order = []
    unordered =inorder(tree,order)
    unordered.sort()
    print(unordered)
    return unordered[len(unordered)-k];
def inorder(tree, order):
    if tree is None:
        return
    inorder(tree.left,order)
    order.append(tree.value);
    inorder(tree.right,order)
    return order