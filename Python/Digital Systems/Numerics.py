def convert_to_decimal(number, base):
    return int(number, base)

def convert_from_decimal(decimal, base):
    hex_digits = "0123456789ABCDEF"
    result = ""
    while decimal > 0:
        result = hex_digits[decimal % base] + result
        decimal //= base
    return result if result else "0"

def main():
    number_type = input("Enter the type of your number (binary, octal, decimal, hexadecimal): ").lower()
    number = input("Enter your number: ")
    
    bases = {
        "binary": 2,
        "octal": 8,
        "decimal": 10,
        "hexadecimal": 16
    }
    
    if number_type not in bases:
        print("Invalid number type.")
        return
    
    input_base = bases[number_type]
    decimal_number = convert_to_decimal(number, input_base)
    
    target_base = int(input("Enter the base to convert to (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal): "))
    
    if target_base not in [2, 8, 10, 16]:
        print("Invalid target base.")
        return
    
    if target_base == 10:
        print(f"The number in decimal is: {decimal_number}")
    else:
        converted_number = convert_from_decimal(decimal_number, target_base)
        print(f"The number in base {target_base} is: {converted_number}")
x = True
while x == True:
    main()
    answ = int(input("Do you want to convert another number? 1-yes 2-no "))
    if answ == 2:
        x = False
