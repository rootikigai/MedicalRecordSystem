import unittest

from MedicalRecordHistory.MedicalRecordSystem.src.doctor import Doctor, Specialization, FauxContactDetails

class DoctorTest(unittest.TestCase):
    def setUp(self):
        self.doctor = Doctor(Specialization.PEDIATRICS, FauxContactDetails("Jill", "07012211221", "tamsbaby22@gmail.com"))

    def tearDown(self):
        Doctor.reset_id()

    def test_doctor_id_is_001_for_first_doctor(self):
        self.assertEqual("001", self.doctor.get_id())

    def test_doctor_id_is_002_for_second_doctor(self):
        self.assertEqual("001", self.doctor.get_id())

        doctor2 = Doctor(Specialization.PEDIATRICS, FauxContactDetails("Tamana", "09022224444", "tamsbaby22@gmail.com"))
        self.assertEqual("002", doctor2.get_id())

    def test_doctor_specialization_is_returned_correctly(self):
        self.assertEqual("Pediatrician", self.doctor.get_specialization())

        doctor2 = Doctor(Specialization.NEUROLOGY, FauxContactDetails("Tamana", "09022224444", "tamsbaby22@gmail.com"))
        self.assertEqual("Neurologist", doctor2.get_specialization())

    def test_doctor_name_number_and_email_from_contact_details_are_correct(self):
        doctor2 = Doctor(Specialization.NEUROLOGY, FauxContactDetails("Tamana", "09022224444", "tamsbaby22@gmail.com"))
        self.assertEqual("Tamana", doctor2.get_contact_details().get_name())
        self.assertEqual("09022224444", doctor2.get_contact_details().get_phone_number())
        self.assertEqual("tamsbaby22@gmail.com", doctor2.get_contact_details().get_email())

if __name__ == '__main__':
    unittest.main()
