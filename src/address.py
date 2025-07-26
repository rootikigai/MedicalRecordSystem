class Address(object):
    def __init__(self, house_number, street, lga, state):
        self._house_number = house_number
        self._street = street
        self._lga = lga
        self._state = state

    def get_house_number(self):
        return self._house_number
    def get_street(self):
        return self._street
    def get_lga(self):
        return self._lga
    def get_state(self):
        return self._state