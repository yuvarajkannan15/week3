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
# c="yuvarajkannan12345@gmail.com"
# character=0
# special=0
# num=0
# for i in c:
#     if i.isalpha():
#        character+=1
#     elif i.isdigit():
#         num+=1
#     else:
#         special+=1

# print("character :",character)
# print("num :",num)
# print("special :",special)
#--------------------------------------
# ch="java is the powerful language"
# max=0
# for i in ch.split():
#     if len(i) > max :
#       max=len(i)
# for i in ch.split():
#      if(max==len(i)):
#        print(i)
#        break
#----------------------------------------
# ch="swiss"
# for i in range(len(ch)):
#     if ch.count(ch[i])==1:
#         print(ch[i])
#         break
#----------------------------------------
# str="java is a powerful language"
# splitstr=str.split()
# for i in range (len(splitstr)):
#    print(splitstr[len(splitstr)-i-1],end=" ")
#-----------------------------------------
# stream="java@123"
# result=[0,0,0]
# for i in stream:
#    if i.isalpha():
#       result[0] +=1
#    elif i.isdigit():
#       result[1] +=1
#    else:
#       result[2] +=1
# print(result)
#-------------------------------------------
# s1 = "abcd"
# s2 = "cdab"
# if len(s1) == len(s2) and s2 in (s1 + s1):
#     print("true")
# else:
#     print("false")
#--------------------------------------------
# s1 = "abcd"
# s2 = "cdab"
# left=''
# for i in s1+'':
#     if s1+left==s2:
#        print(True)
#        quit()
#     left +=i
#     s1=s1[1:]
# print(False)
#---------------------------------------------
# str1="java is powerfull"
# output=''
# for i in str1.split()[::-1]:
#     output +=i+' '
# print(output.strip())
#---------------------------------------------
# result = currentWord = ''
# for i in string1+' ':
#     if i == ' ':
#         result = ' '+currentWord+result
#         currentWord = ''
#     else:currentWord += i
# print(result[1:] if result else '')
#-----------------------------------------
# n=int(input("Enter no"))
# for i in range(n):
#     for j in range(n):
#         print("*",end=" ")
#     print()
#-----------------------------------------
# n=int(input("Enter no : "))
# for i in range(n):
#     print('* '*n)
#-----------------------------------------
# n=4
# for i in range(n):
#     str=""
#     for j in range(n):
#       if(i==0 or j==0 or i==n-1 or j==n-1):str +="* "
#       else:str+="  " 
#     print(str[:-1])
#-------------------------------------------
# n=5
# for i in range(n):
#     print(("* "*i).strip())
#--------------------------------------------
# n=5
# for i in range(n):
#     str=""
#     for j in range(i):
#       if(i==0 or j==0 or i==n-1 or j==n-1):str +="* "
#       else:str+="  " 
#     print(str[:-1])
#----------------------------------------------
# str="aaabbacac"
# dic={}
# for i in str:
#     if i in dic:
#         dic[i]+=1
#     else:
#         dic[i]=1
# print(sorted (dic,key=lambda x:dic[x]))
#-----------------------------------------------
# dic={"yuvaraj":20 ,"naveen":21,"ravi":20,"sethu":21,"ram":21,"siva":20}
# sdic={}
# for i in dic:
#     if dic[i] in sdic:
#         sdic[dic[i]].append(i)
#     else:
#         sdic[dic[i]]=[i]
# print(sdic)
#-----------------------------------------------
# str="aaabbacac"
# dic={}
# for i in str:
#     if i in dic: 
#         dic[i]+=1
#     else:
#         dic[i]=1
# sortedFreq=(sorted (dic,key=lambda x:dic[x]))
# result = ones = ''
# for i in sortedFreq[::-1]:
#     frequency = dic[i]
#     half = frequency // 2
#     if frequency % 2 and not ones:
#         result += i * half
#         ones = i
#     elif frequency > 1:
#         result += i * half
# largestPalindrome = result + ones + result[::-1]
# print(largestPalindrome)
# print(largestPalindrome == largestPalindrome[::-1])
#---------------------------------------------------
#Program to find the hollow left triangle pattern
# n = int(input("Enter the no. of rows : "))
# for i in range(1, n + 1):
#     temp = ""
#     for j in range(1, i + 1):
#         if j == 1 or j == i or i == n:
#             temp += "* "
#         else:
#             temp += "  
#     print(temp[:-1])
#--------------------------------------------
# n=5
# for i in range(1,n+1):
#     print(("  "*(n-i) + "* "*i))
#--------------------------------------------
# stream1={1,2,3}
# stream2={5,6,3}
# result=stream1.union(stream2)
# print(result)
#--------------------------------------------
# def sample(n):
#   result =""
#   for i in range(1,n+1):
#     result = ("  "*(n-i) + "* "*i) +"\n"+ result
#   return result
# print(sample(5))
#---------------------------------------------
# print(f'{10:b}')
# name='yuvaraj'
# age=10
# print(f'name:{name} age:{age}')
# print(f'{20:13%}')
# print(f'{20:>05}')
# print(f'{20:<05}')
# print(f'{20:^05}')
#-----------------------------------------------
# l=[1,4,5,6,2]
# print(sorted(l))
# print(max(l))
# print(min(l))
# print(list(filter(lambda x:x%2,l)))
# print(list(map(lambda x:x**2,l)))
# l2=[[1,2,3],[4,6,7],[5,8,9]]
# print(list(zip(*l2)))
# print(any(i%2==0 for i in [7,3,5]))
# print(all(i%2==0 for i in[4,6,8]))
#----------------------------------------------

 
 