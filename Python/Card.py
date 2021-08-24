from payments import Payments
class Card(Payments):
    number = int
    cvv = int
    date = str

    def __init__(self, amount, kind, number, cvv, date):
        super().__init__(amount, kind)
        self.number = number
        self.cvv = cvv
        self.date = date
        