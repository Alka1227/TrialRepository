def fraction(a,b):
    def fracs(a,b):
        while b !=0:
            c=b
            b=a%b
            a=c
        return a
    PIPOL = fracs(a,b)
    a/=PIPOL
    b/=PIPOL
    print("Your denominator is ",a,"the numerator is: ",b)
    return(a,b)
print(fraction(6,63))
