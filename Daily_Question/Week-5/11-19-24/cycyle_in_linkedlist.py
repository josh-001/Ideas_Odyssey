
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        currentIndex=head
        add_set=set()
        while currentIndex:
            if currentIndex in add_set:
                return currentIndex
            else:
                add_set.add(currentIndex)
                currentIndex=currentIndex.next
        return None 