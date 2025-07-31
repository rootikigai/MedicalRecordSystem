import unittest
from datetime import datetime, timedelta
from src.appointment import *
from src.address import *
from src.medical_history import *

class AppointmentTest(unittest.TestCase):
    def setUp(self):
        self.address = Address("312", "Herbert Macaulay Road", "Yaba", "Lagos")
        self.contact_details = ContactDetails("Kelvin Ifeanyi", "kelvin.ifeanyi@yahoo.com", "+2348161247818", self.address)
        self.medical_history = MedicalHistory()
        self.patient = Patient("Kelvin Ifeanyi", self.contact_details, "Male", "1990-04-18", self.medical_history)
        self.doctor_contact = FauxContactDetails("Dr. Ikigai", "07055700122", "ikigai@gmail.com")
        self.doctor = Doctor(Specialization.PSYCHIATRY, self.doctor_contact)
        self.date_time = datetime.now() + timedelta(days=1)
        self.appointment = Appointment("A001", self.patient, self.doctor, self.date_time, "Scheduled")

    def tearDown(self):
        Doctor.reset_id()

    def test_that_appointment_is_initialized_correctly(self):
        self.assertEqual(self.appointment.get_appointment_id(), "A001")
        self.assertEqual(self.appointment.get_patient(), self.patient)
        self.assertEqual(self.appointment.get_doctor(), self.doctor)
        self.assertEqual(self.appointment.get_date_time(), self.date_time)
        self.assertEqual(self.appointment.get_status(), "Scheduled")

    def test_that_appointment_returns_in_string_format(self):
        expected = f"Appointment A001: {self.patient.getId()} with {self.doctor.get_id()} on {self.date_time.strftime('%Y-%m-%d %H:%M')} (Scheduled)"
        self.assertEqual(str(self.appointment), expected)

    def test_that_a_valid_status_can_be_set(self):
        self.appointment.set_status("Confirmed")
        self.assertEqual(self.appointment.get_status(), "Confirmed")
        self.appointment.set_status("cancelled")
        self.assertEqual(self.appointment.get_status(), "Cancelled")

    def test_that_invalid_status_set_raises_exception(self):
        with self.assertRaises(InvalidStatusException):
            self.appointment.set_status("Invalid")

    def test_that_past_date_raises_exception(self):
        past_date = datetime.now() - timedelta(days=1)
        with self.assertRaises(InvalidAppointmentDateException):
            Appointment("A002", self.patient, self.doctor, past_date, "Scheduled")

    def test_that_invalid_status_during_initialization_raises_exception(self):
        with self.assertRaises(InvalidStatusException):
            Appointment("A002", self.patient, self.doctor, self.date_time, "Invalid")


if __name__ == '__main__':
    unittest.main()