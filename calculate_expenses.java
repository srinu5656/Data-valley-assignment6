def calculate_expenses(quantity, price_per_item):
    total_expenses = quantity * price_per_item

    if quantity > 50:
        discount = 0.1 * total_expenses
    elif quantity >= 25:
        discount = 0.05 * total_expenses
    else:
        discount = 0

    final_expenses = total_expenses - discount
    return final_expenses

def main():
    try:
        quantity = int(input("Enter the quantity purchased: "))
        price_per_item = float(input("Enter the price per item: "))

        if quantity < 0 or price_per_item < 0:
            print("Invalid input. Quantity and price per item must be non-negative.")
            return

        total_expenses = calculate_expenses(quantity, price_per_item)
        print("Total expenses: $", total_expenses)

    except ValueError:
        print("Invalid input. Please enter valid numeric values.")

if __name__ == "__main__":
    main()
