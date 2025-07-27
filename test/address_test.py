import unittest

from address import Address


class AddressTest(unittest.TestCase):
    def setUp(self):
        house_number = "312"
        street = "Herbert Macaulay Road"
        lga = "Yaba"
        state = "Lagos"
        self.address = Address(house_number, street, lga, state)
        self.test_house_number = house_number
        self.test_street = street
        self.test_lga = lga
        self.test_state = state

    def test_address_can_be_created(self):
        self.assertEqual(self.address.get_house_number(), self.test_house_number)
        self.assertEqual(self.address.get_street(), self.test_street)
        self.assertEqual(self.address.get_lga(), self.test_lga)
        self.assertEqual(self.address.get_state(), self.test_state)

    def test_that_address_with_empty_strings_raises_error(self):
        with self.assertRaises(ValueError):
            Address("", self.test_street, self.test_lga, self.test_state)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, "", self.test_lga, self.test_state)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, self.test_street, "", self.test_state)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, self.test_street, self.test_lga, "")

    def test_that_address_with_spaces_only_raises_error(self):
        with self.assertRaises(ValueError):
            Address("  ", self.test_street, self.test_lga, self.test_state)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, "  ", self.test_lga, self.test_state)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, self.test_street, "  ", self.test_lga)
        with self.assertRaises(ValueError):
            Address(self.test_house_number, self.test_street, self.test_lga, "  ")

if __name__ == '__main__':
    unittest.main()
