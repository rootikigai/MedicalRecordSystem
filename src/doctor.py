from enum import Enum

class FauxContactDetails:
    def __init__(self, name, phone_number, email):
        self._name = name
        self._phone_number = phone_number
        self._email = email

    def get_name(self):
        return self._name

    def get_phone_number(self):
        return self._phone_number

    def get_email(self):
        return self._email

class Specialization(Enum):
    CARDIOLOGY = "Cardiologist"
    PEDIATRICS = "Pediatrician"
    NEUROLOGY = "Neurologist"
    ORTHOPEDICS = "Orthopedic Surgeon"
    DERMATOLOGY = "Dermatologist"
    OPHTHALMOLOGY = "Ophthalmologist"
    PATHOLOGY = "Pathologist"
    HEMATOLOGY = "Hematologist"
    ONCOLOGY = "Oncologist"
    IMMUNOLOGY = "Immunologist"
    PSYCHOLOGY = "Psychologist"
    PSYCHIATRY = "Psychiatrist"


class Doctor:
    _doctor_id = 0
    def __init__(self, specialization: Specialization, contact_details: FauxContactDetails):
        Doctor._doctor_id = Doctor._doctor_id + 1
        self._id = f"{self._doctor_id:03}"
        self._specialization = specialization.value
        self._contact_details = contact_details

    def get_id(self):
        return self._id

    def get_specialization(self) :
        return self._specialization

    def get_contact_details(self):
        return self._contact_details

    @staticmethod
    def reset_id():
        Doctor._doctor_id = 0