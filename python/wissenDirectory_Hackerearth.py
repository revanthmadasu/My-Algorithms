import queue
n=int(input())
inp=input().split(' ')

parents=[]

for i in inp:
    parents.append(int(i))
    
treeInListFormat=[]
for i in range(n+1):
    treeInListFormat.append([])

for i in range(1,n):
    treeInListFormat[parents[i]].append(i+1)
m=int(input())
nodesToDelete=[]
inp=input().split(' ')
for i in inp:
    nodesToDelete.append(int(i))
q=queue.Queue(maxsize=100000)
q.put(1)
count=0
while not q.empty():
    currentNode=q.get()
    if nodesToDelete.__contains__(currentNode):
        count=count+1
    else:
        for i in treeInListFormat[currentNode]:
            q.put(i)
print(count)