#Calculate Simple Interest
def calc_si(principal, term, interest_rate):
    simple_interest = (principal * term * interest_rate) / 100
    amount = principal + simple_interest
    return "Simple interest is {:.2f} and total amount is {:.2f}".format(simple_interest, amount)