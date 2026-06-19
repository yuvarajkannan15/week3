# n=[1,2,3,4,5,6,7,8,9,10]
# e=[]
# for i in n:
#     if i%2==0:e.append(i)
# print(e)
# ---------------------------------
# sample=[1,2,3,4,2,3]
# n=[]
# for i in set(sample):
#     if sample.count(i)>1 :n.append(i)
# print(n)
# ----------------------------------
# sample=[1,2,3,4,5,1,2]
# n=[]
# for i in sample:
#     if sample.count(i)>1 and i not in n:
#         n.append(i)
# print(n)
# -----------------------------------
# b=int(input())
# n=[]
# for i in range(b):
#      n.append(int(input()))
# print(n)
#--------------------------------------
# q=int(input())
# p=[0]*q
# for i in range(len(p)):
#      p[i]=int(input())    
# print(max(p)) 
#---------------------------------------
# a=[1,2,3,4,2,3,2]
# n = int(input())
# g=0
# for i in a:
#       if(n==i):
#            g+=1         
# print(g)
#---------------------------------------
# a=[1,2,3,4]
# for i in range (len(a)):
#     a[i]**=2
# print(a)
#---------------------------------------
# a=[1,2,3,4]
# b = []
# for i in a:
#      b.append(i**2)
# print(b)
#---------------------------------------
# b =[1,2,4]
# a =[ x**2 for x in b]
# print(a)
#-----------------------------------------
# a=[1,2,3,4,5]
# n=int(input())
# for i in a:
#     if n==i:
#          print("true")
#          break
# else:
#      print("false")
#------------------------------------------
# a=[1,2,3,4,5]
# n=int(input())
# if n in a:
#      print("true")
# else:
#      print("false")
#-------------------------------------------
# a=[2,1,3,3,4,1]
# for i in a:
#     if a.count(i)>1:
#         print(i)
#         break
#-------------------------------------------
# a=[1,2,3,4,5,1]
# b=[]

# for i in a:
#     if i in b:
#         print(i)
#         break
#     b.append(i)
#------------------------------------------
# b=[]
# for i in [1,2,3,4,5,2]:
#     if i in b:
#         print(i)
#         break
#     b.append(i)
# else:print("no duplicates found")
#------------------------------------------
print("Agnie Consulting")