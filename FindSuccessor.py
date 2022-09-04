# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None, parent=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent


def findSuccessor(tree, node):
    inordered = inorder(tree)

    for idx, currentNode in enumerate(inordered):
        if currentNode != node:
            continue
        if idx == len(inordered) -1:
            return None
        return inordered[idx+1]

def inorder(node, order =[]):
    if node is None:
        return order
    inorder(node.left,order)
    order.append(node)
    inorder(node.right,order)
    return order
    
    