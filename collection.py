from collections import *
# str="yuvaraj"
# print(Counter(str))
#------------------------------
str="aaavvdd"
data=defaultdict(int)
for i in str:
    data[i] +=1
print(data)