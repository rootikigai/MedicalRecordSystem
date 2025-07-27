import unittest
from MedicalRecordSystem.src.contact_details import ContactDetails, InvalidEmailException, InvalidPhoneException
from MedicalRecordSystem.src.address import Address

class TestContactDetails(unittest.TestCase):

    def setUp(self):
        self.address = Address(
            house_number="312",
            street="Herbert Macaulay Way",
            city="Yaba",
            state="Lagos"
        )

    def test_valid_contact_creation(self):
        contact = ContactDetails(
            name="John Chinedu",
            email="john.chinedu@yahoo.com",
            phone_number="+2348161247818",
            address=self.address
        )

        self.assertEqual(contact.get_name(), "John Chinedu")
        self.assertEqual(contact.get_email(), "john.chinedu@yahoo.com")
        self.assertEqual(contact.get_phone_number(), "+2348161247818")
        self.assertEqual(contact.get_address(), self.address)
        self.assertEqual(str(contact), "John Chinedu, john.chinedu@yahoo.com, +2348161247818, 312 Herbert Macaulay Way, Yaba, Lagos")

    def test_invalid_email_raises_exception(self):
        with self.assertRaises(InvalidEmailException):
            ContactDetails(
                name="James",
                email="james#yahoo.com",
                phone_number="+23446591103",
                address=self.address
            )

    def test_invalid_phone_raises_exception(self):
        with self.assertRaises(InvalidPhoneException):
            ContactDetails(
                name="IKIGAI",
                email="IKIGAI@yahoo.com",
                phone_number="123-abc-7890",
                address=self.address
            )

    def test_get_info_returns_correct_dictionary(self):
        contact = ContactDetails(
            name="john Chinedu",
            email="john.chinedu@yahoo.com",
            phone_number="2348161247818",
            address=self.address
        )
        expected = {
            "name": "john Chinedu",
            "email": "john.chinedu@yahoo.com",
            "phone_number": "2348161247818",
            "address": {
                "house_number": "312",
                "street": "Herbert Macaulay Way",
                "city": "Yaba",
                "state": "Lagos"
            }
        }
        self.assertEqual(contact.get_info(), expected)


