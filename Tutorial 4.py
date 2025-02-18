from collections import deque
def demonstrateList(list):
    list.append("Apples")
    list.append("Oranges")
    list.append("Bananas")
    print(list)
    
    list.insert(1, "Pineapples")
    print(list)
    
    del list[2]
    print(list)
    print(len(list))

    
print("Using a regular list")
demonstrateList([])

print("Now using a deque")
d = deque()
demonstrateList(d)



