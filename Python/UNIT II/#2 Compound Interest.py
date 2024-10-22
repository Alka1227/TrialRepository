savings=int(input("how much money do you have in the bank?  "))
interest=savings*.04
years=int(input("how many years has the account? "))
#final=savings+(years*interest)
#print(final)
for i in range(1,years+1):
    savings=savings*1.04
    print(f"Your interest in year number {i} is:")
    print(round(savings,2))
    