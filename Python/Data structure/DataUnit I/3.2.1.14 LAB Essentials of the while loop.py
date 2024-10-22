#3.2.1.14 LAB: Essentials of the while loop
blocks=int(input("GIve the number of blocks: "))
height=0
layer=1
while blocks >=layer:
    height+=1
    blocks-=layer
    layer+=1
print("the height is", height)
