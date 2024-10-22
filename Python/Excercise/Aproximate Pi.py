a = 2
b = 3
c = 4
count = 1
pcount = 0
ncount = 0
pi = 0
decimals = 0
results = int(input("how many results do you want? "))
for count in range (results):
    pcount = 4/(a*b*c)
    a = a+2
    b = b+2
    c =c+2
    decimals = decimals + pcount
    count +=1
    ncount = 4/(a*b*c)
    a = a+2
    b = b+2
    c =c+2
    decimals = decimals - ncount
    count +=1
    print(3 +decimals)