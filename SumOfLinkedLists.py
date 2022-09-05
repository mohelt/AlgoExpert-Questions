# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def sumOfLinkedLists(linkedListOne, linkedListTwo):
    
    str1 = "" 
    str2 = ""
    currentNode = LinkedList(0)
    Head = currentNode
    while linkedListOne is not None:
        str1+=str(linkedListOne.value)
        linkedListOne=linkedListOne.next
    while linkedListTwo is not None:
        str2+=str(linkedListTwo.value)
        linkedListTwo=linkedListTwo.next
    str1=str1[::-1]
    str2=str2[::-1]
    int1=int(str1)
    int2=int(str2)
    int3 = str(int1+int2)
    int3 =int3[::-1]
    for i in range(len(int3)):
        currentNode.next=LinkedList(int(int3[i]))
        currentNode=currentNode.next
    return Head.next
