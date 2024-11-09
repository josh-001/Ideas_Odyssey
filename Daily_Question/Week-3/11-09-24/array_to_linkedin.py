class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def array_to_linked_list(arr):
    if not arr:
        return None

    head = Node(arr[0])
    current = head

    for data in arr[1:]:
        node = Node(data)
        current.next = node
        current = node

    return head

# Example usage:
arr = [1, 2, 3, 4, 5]
head = array_to_linked_list(arr)

# Print the linked list
while head:
    print(head.data, end=" -> ")
    head = head.next
print("None")