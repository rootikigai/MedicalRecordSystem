import re
from datetime import datetime
from src.contact_details import *
from src.medical_history import *


class InvalidGenderException(Exception): pass
class InvalidDateOfBirthException(Exception): pass

class Patient:
    _id_counter = 0
    def __init__(self,name: str, contact_details, gender: str, date_of_birth, medical_history):
        Patient._id_counter += 1
        self.patient_id = f"P{Patient._id_counter:03}"
        self.name = name
        self.contact_details = contact_details
        self.gender = self._validate_gender(gender)
        self.date_of_birth = self._validate_date_of_birth(date_of_birth)
        self.medical_history = medical_history

    def _validate_gender(self, input_gender: str) -> str:
        valid_genders = {"male", "female", "other"}
        normalized_gender = input_gender.strip().lower()

        if normalized_gender not in valid_genders:
            raise InvalidGenderException(f"Invalid gender: '{input_gender}'")

        return normalized_gender

    def _validate_date_of_birth(self, date_of_birth_str: str) -> str:
        try:
            datetime.strptime(date_of_birth_str, "%Y-%m-%d")
        except ValueError:
            raise InvalidDateOfBirthException("Date of birth must be a valid date in YYYY-MM-DD format")

        return date_of_birth_str

    def getId(self) -> str:
        return self.patient_id

    def getContactDetails(self):
        return self.contact_details

    def getGender(self) -> str:
        return self.gender

    def getDateOfBirth(self):
        return self.date_of_birth

    def getMedicalHistory(self):
        return self.medical_history

    def __str__(self):
        return f"{self.name} ({self.gender}, DOB: {self.date_of_birth}) - ID: {self.patient_id}"
