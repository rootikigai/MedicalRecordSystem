class Address(object):
    def __init__(self, house_number, street, lga, state):
        self.house_number = house_number
        self.street = street
        self.lga = lga
        self.state = state

    def get_house_number(self):
        return self.house_number
    def get_street(self):
        return self.street
    def get_lga(self):
        return self.lga
    def get_state(self):
        return self.state