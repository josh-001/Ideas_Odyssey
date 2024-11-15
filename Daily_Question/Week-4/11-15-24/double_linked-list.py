

class Node:
    def __init__(self,data):
        # self.data=data
        self.curr=data
        self.head=None
        self.tail=None
def insert_elemnet(data):
    if len(data)==0:
        return
    x=Node(data[0])
    curr=x
    for i in range(1,len(data)):
        new_x=Node(data[i])
        curr.tail=new_x
        new_x.head=curr
        curr=new_x
    return x
    
if __name__=="__main__":
    x=[1,2,3,4,5]
    y=insert_elemnet(x)
    current = y
    while current:
        print(current.curr, end=" ")
        current = current.tail




