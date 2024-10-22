#7 Discount Table
originalprice=[4.95, 9.95, 14.95, 19.95,24.95]
discount=[]
newprice=[]
for i in originalprice:
    newprice.append(round(i-(i*.60),2))
    discount.append(round((i*.60),2))
print(originalprice)
print(discount)
print(newprice)
