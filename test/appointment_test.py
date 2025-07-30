import unittest

from src.patient import Patient


class AppointmentTest(unittest.TestCase):
    def setUp(self):
        self.patient = Patient()

    def test_that_user_can_schedule_appointment(self):
        self.assertEqual(True, False)  # add assertion here


if __name__ == '__main__':
    unittest.main()