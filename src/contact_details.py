import re
from MedicalRecordSystem.src.address import *

class InvalidEmailException(Exception): pass
class InvalidPhoneException(Exception): pass

class ContactDetails:
    def __init__(self, name: str, email: str, phone_number: str, address: Address):
        if not re.match(r"[^@]+@[^@]+\.[^@]+", email):
            raise InvalidEmailException("Invalid email format")

        if not re.match(r"^\+?\d{10,15}$", phone_number):
            raise InvalidPhoneException("Invalid phone number")

        self.name = name
        self.email = email
        self.phone_number = phone_number
        self.address = address

    def get_name(self):
        return self.name

    def get_email(self):
        return self.email

    def get_phone_number(self):
        return self.phone_number

    def get_address(self):
        return self.address

    def get_info(self):
        return {
            "name": self.name,
            "email": self.email,
            "phone_number": self.phone_number,
            "address": self.address.get_info()
        }

    def __str__(self):
        return f"{self.name}, {self.email}, {self.phone_number}, {self.address}"
