#list方法总结 len，索引读值，append（添加到末尾） insert pop(删除末尾，可指定位置)
classmates = ['Tom','evil','ostrich']   
print(classmates)
print(len(classmates))
print(classmates[0]+' '+classmates[-1])
classmates.append('cat')
print(classmates)

classmates.insert(1,'jack')
print(classmates)

classmates.pop()
print(classmates)


#tuple
t=(1,2,3)
print(t)
t=(1,)
print(t)