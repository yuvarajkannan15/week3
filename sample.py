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
# s="listen"
# s1="silent"
# print(sorted(s)==sorted(s1))
#------------------------------------------
# st = "aaabbcc"
# a = []
# i = 0
# while i < len(st):
#     count = 1
#     while i + 1 < len(st) and st[i] == st[i + 1]:
#         count += 1
#         i += 1
#     a.append(st[i])
#     a.append(count)
#     i += 1
# print(a)
#-------------------------------------------
# stream=[0]*26
# stream1=[0]*26
# str="silent"
# str1="listen"
# for i in str.lower():
#     stream[ord(i)-97] +=1
# for i in str1.lower():
#     stream1[ord(i)-97]+=1
# if(stream==stream1):print("true")
# else:print("false")
#---------------------------------------
# st = "aaabbcc"
# out=""
# stream=[0]*26
# for i in st.lower():
#     stream[ord(i)-97]+=1
# for i in range (len(stream)):
#     if(stream[i]>0):
#       out +=chr(97+i)+str(stream[i])
# print(out)
#-----------------------------------------