import unittest


from MedicalRecordSystem.src.contact_details import *


class TestContactDetails(unittest.TestCase):

    def test_valid_contact_creation(self):
        contact = ContactDetails(
            name="John Chinedu",
            email="john.chinedu@yahoo.com",
            phone_number="+2348161247818",
            address="312 hebert macauly way sabo yaba"
        )

        self.assertEqual(contact.get_name(), "John Chinedu")
        self.assertEqual(contact.get_email(), "john.chinedu@yahoo.com")
        self.assertEqual(contact.get_phone_number(), "+2348161247818")
        self.assertEqual(contact.get_address(), "312 hebert macauly way sabo yaba")

    def test_invalid_email_raises_exception(self):
        with self.assertRaises(InvalidEmailException):
            ContactDetails(
                name="James",
                email="james#yahoo.com",
                phone_number="+23446591103",
                address="456 kaduna street"
            )

    def test_invalid_phone_raises_exception(self):
        with self.assertRaises(InvalidPhoneException):
            ContactDetails(
                name="IKIGAI",
                email="IKIGAI@yahoo.com",
                phone_number="123-abc-7890",
                address="789 lagos Street"
            )

    def test_get_info_returns_correct_dictionary(self):
        contact = ContactDetails(
            name="john Chinedu",
            email="john.chinedu@yahoo.com",
            phone_number="2348161247818",
            address="312 jakande island"
        )
        info = contact.get_info()
        expected = {
            "name": "john Chinedu",
            "email": "john.chinedu@yahoo.com",
            "phone_number": "2348161247818",
            "address": "312 jakande island"
        }
        self.assertEqual(info, expected)


