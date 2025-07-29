from _datetime import datetime, timedelta
import re

class MedicalHistory:
    def __init__(self, medical_conditions=None, surgeries=None, allergies=None, medications=None, last_visit_date=None):
        self._medical_conditions: list = medical_conditions
        self._surgeries: list = surgeries
        self._allergies: list = allergies
        self._medications: list = medications
        self._family_history: dict = {"father" : [],
                "mother" : [],
                "brother" : [],
                "sister" : []
        }
        self._last_visit_date = last_visit_date

    def get_medical_conditions(self) -> list:
        return self._medical_conditions

    def add_medical_condition(self, condition) -> None:
        pattern = r"^[A-Za-z\s]+(?:-(19\d\d|20(?:0\d|1\d|2[0-5])))?$"

        if not re.match(pattern, condition):
            raise ValueError("Invalid! Use format: condition or condition - YYYY (1900–2025)")


        self._medical_conditions.append(condition)
        

    def get_medications(self) -> list:
        return self._medications

    def add_medication(self, medication) -> None:
        pattern = r"^[A-Za-z\s]+(?:-(19\d\d|20(?:0\d|1\d|2[0-5])))?$"
        if not re.match(pattern, medication):
            raise ValueError("Invalid! Use format: medication or medication - YYYY (1900–2025)")
        self._medications.append(medication)

    def add_allergy(self, allergy) -> None:
        pattern = r"^[a-zA-Z\s]+$"
        if not re.match(pattern, allergy):
            raise ValueError("Allergies should contain only letters")
        self._allergies.append(allergy)

    def get_allergies(self) -> list:
        return self._allergies

    def add_surgery(self, surgery) -> None:
        pattern = r"^[a-zA-Z\s]+$"
        if not re.match(pattern, surgery):
            raise ValueError("Allergies should contain only letters")
        self._surgeries.append(surgery)

    def get_surgeries(self) -> list:
        return self._surgeries

    def add_family_history(self, family_member, condition) -> None:
        if family_member not in self._family_history.keys():
            raise ValueError("Family member must be either father, mother, brother, or sister")

        pattern = r"^[A-Za-z\s]+(?:-(19\d\d|20(?:0\d|1\d|2[0-5])))?$"

        if not re.match(pattern, condition):
            raise ValueError("Invalid! Use format: condition or condition - YYYY (1900–2025)")
        self._family_history[family_member].append(condition)

    def get_family_history(self) -> dict:
        return self._family_history

    def get_last_visit_date(self) -> str:
        output = "%d/%m/%Y"
        return self._last_visit_date.strftime(output)

    def set_last_visit_date(self, last_visit_date) -> None:
        if last_visit_date > datetime.today() - timedelta(days=1):
            raise ValueError("Last visit date must be before today")
        self._last_visit_date = last_visit_date
