import unittest
from MedicalRecordSystem.src.patient import *

class DummyContactDetails:
    def get_info(self): return {"dummy": "info"}

class DummyMedicalHistory:
    def get_info(self): return {"history": "clear"}

class TestPatientValidation(unittest.TestCase):
    def setUp(self):
        self.contact = DummyContactDetails()
        self.history = DummyMedicalHistory()

    def test_valid_gender_and_dob(self):
        patient = Patient(
            name="Jane chinedu",
            contact_details=self.contact,
            gender="male",
            date_of_birth="1990-01-01",
            medical_history=self.history
        )
        self.assertEqual(patient.getGender(), "male")
        self.assertEqual(patient.getDateOfBirth(), "1990-01-01")

    def test_invalid_gender_raises_exception(self):
        with self.assertRaises(InvalidGenderException):
            Patient(
                name="james",
                contact_details=self.contact,
                gender="Alien",
                date_of_birth="1995-12-31",
                medical_history=self.history
            )

    def test_invalid_dob_format_raises_exception(self):
        with self.assertRaises(InvalidDateOfBirthException):
            Patient(
                name="ikigia",
                contact_details=self.contact,
                gender="male",
                date_of_birth="12/31/1995",
                medical_history=self.history
            )

    def test_invalid_dob_nonexistent_date_raises_exception(self):
        with self.assertRaises(InvalidDateOfBirthException):
            Patient(
                name="patience",
                contact_details=self.contact,
                gender="female",
                date_of_birth="2024-02-30",
                medical_history=self.history
            )


