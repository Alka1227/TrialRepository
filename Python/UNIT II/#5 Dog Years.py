#5 Dog Years
dog_years=int(input("How old is your dog?: "))
years=4
if(dog_years>=0):
    if(dog_years<=2):
        years=dog_years* 10.5
        print("The age of your dog in human years is: ", years)
    else:
        if dog_years>=3:
            dog_years-=2
            years=(years*dog_years)+21
            print("The age of your dog in human years is: ", years)
else:
    print("You can't type a negative number")
