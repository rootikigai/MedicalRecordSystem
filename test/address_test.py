import unittest

from address import Address


class AddressTest(unittest.TestCase):
    def test_address_can_be_created(self):
        house_number = "312"
        street = "Herbert Macauley Road"
        lga = "Yaba"
        state = "Lagos"

        address = Address(house_number, street, lga, state)

        self.assertEqual(address.get_house_number(), house_number)
        self.assertEqual(address.get_street(), street)
        self.assertEqual(address.get_lga(), lga)
        self.assertEqual(address.get_state(), state)



if __name__ == '__main__':
    unittest.main()
