class Address:
    def __init__(self, house_number, street, lga, state):
        if not isinstance(house_number, str):
            raise TypeError('House number must be a string')
        if not isinstance(street, str):
            raise TypeError('Street must be a string')
        if not isinstance(lga, str):
            raise TypeError('LGA must be a string')
        if not isinstance(state, str):
            raise TypeError('State must be a string')

        if not house_number or not house_number.strip():
            raise ValueError("Your house number is required")
        if not street or not street.strip():
            raise ValueError("Your street is required")
        if not lga or not lga.strip():
            raise ValueError("Your lga is required")
        if not state or not state.strip():
            raise ValueError("Your state is required")

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

    def get_full_address(self):
        return f"{self._house_number}{self._street}{self._lga}{self._state}"
        pass