import unittest

from address import Address


class AddressTest(unittest.TestCase):
    def setUp(self):
        self.house_number = "312"
        self.street = "Herbert Macaulay Road"
        self.lga = "Yaba"
        self.state = "Lagos"

    def test_address_can_be_created(self):
        address = Address(self.house_number, self.street, self.lga, self.state)

        self.assertEqual(address.get_house_number(), self.house_number)
        self.assertEqual(address.get_street(), self.street)
        self.assertEqual(address.get_lga(), self.lga)
        self.assertEqual(address.get_state(), self.state)



if __name__ == '__main__':
    unittest.main()
