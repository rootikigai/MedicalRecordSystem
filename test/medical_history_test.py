import unittest
from datetime import datetime

from MedicalRecordHistory.MedicalRecordSystem.src.medical_history import MedicalHistory

class MedicalHistoryTest(unittest.TestCase):
    def setUp(self):
        self.history = MedicalHistory([], [], [], [], datetime.strptime("26/07/2025", "%d/%m/%Y"))

    def test_medical_condition_is_one_when_one_medical_condition_is_added(self):
        self.history.add_medical_condition("condition one")
        condition = self.history.get_medical_conditions()
        self.assertEqual(1, len(condition))

    def test_medical_condition_is_two_when_two_medical_conditions_are_added(self):
        self.history.add_medical_condition("condition one")
        self.history.add_medical_condition("condition two")
        condition = self.history.get_medical_conditions()
        self.assertEqual(2, len(condition))

    def test_condition_name_is_correct_when_medical_condition_is_added(self):
        self.history.add_medical_condition("condition one")
        condition = self.history.get_medical_conditions()
        self.assertEqual("condition one", condition[0])

    def test_value_error_is_raised_when_added_medical_condition_is_empty(self):
        self.assertRaises(ValueError, self.history.add_medical_condition, "")

    def test_value_error_is_raised_when_condition_does_not_match_format(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_medical_condition("condition one-")
        self.assertEqual("Invalid! Use format: condition or condition - YYYY (1900–2025)", str(context.exception))

    def test_value_error_is_raised_if_condition_year_is_added_but_outside_range_1900to2025(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_medical_condition("condition one-2026")
        self.assertEqual("Invalid! Use format: condition or condition - YYYY (1900–2025)", str(context.exception))

        with self.assertRaises(ValueError) as context:
            self.history.add_medical_condition("condition one-1899")
        self.assertEqual("Invalid! Use format: condition or condition - YYYY (1900–2025)", str(context.exception))

    def test_medication_is_one_when_one_medication_is_added(self):
        self.history.add_medication("medication one")
        medication = self.history.get_medications()
        self.assertEqual(1, len(medication))

    def test_more_than_two_medications_can_be_added(self):
        self.history.add_medication("medication one")
        self.history.add_medication("medication two")
        medication = self.history.get_medications()
        self.assertEqual(2, len(medication))

    def test_medication_name_is_correct_when_medication_is_added(self):
        self.history.add_medication("medication one")
        medication = self.history.get_medications()
        self.assertEqual("medication one", medication[0])

    def test_value_error_is_raised_when_added_medication_is_empty(self):
        self.assertRaises(ValueError, self.history.add_medication, "")

    def test_value_error_is_raised_when_medication_does_not_match_format(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_medication("medication one-")
        self.assertEqual("Invalid! Use format: medication or medication - YYYY (1900–2025)", str(context.exception))

    def test_value_error_is_raised_if_medication_year_is_added_but_outside_range_1900to2025(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_medication("medication one-2026")
        self.assertEqual("Invalid! Use format: medication or medication - YYYY (1900–2025)", str(context.exception))

        with self.assertRaises(ValueError) as context:
            self.history.add_medication("medication one-1899")
        self.assertEqual("Invalid! Use format: medication or medication - YYYY (1900–2025)", str(context.exception))

    def test_allergy_is_one_when_one_allergy_is_added(self):
        self.history.add_allergy("allergy one")
        allergy = self.history.get_allergies()
        self.assertEqual(1, len(allergy))

    def test_allergy_is_two_when_two_allergies_are_added(self):
        self.history.add_allergy("allergy one")
        self.history.add_allergy("allergy two")
        allergy = self.history.get_allergies()
        self.assertEqual(2, len(allergy))

    def test_allergy_name_is_correct_when_allergy_is_added(self):
        self.history.add_allergy("allergy one")
        allergy = self.history.get_allergies()
        self.assertEqual("allergy one", allergy[0])

    def test_value_error_is_raised_when_added_allergy_is_empty(self):
        self.assertRaises(ValueError, self.history.add_allergy, "")

    def test_surgery_is_one_when_one_surgery_is_added(self):
        self.history.add_surgery("surgery one")
        surgery = self.history.get_surgeries()
        self.assertEqual(1, len(surgery))

    def test_surgery_is_two_when_two_surgeries_are_added(self):
        self.history.add_surgery("surgery one")
        self.history.add_surgery("surgery two")
        surgery = self.history.get_surgeries()
        self.assertEqual(2, len(surgery))

    def test_surgery_name_is_correct_when_surgery_is_added(self):
        self.history.add_surgery("surgery one")
        surgery = self.history.get_surgeries()
        self.assertEqual("surgery one", surgery[0])

    def test_value_error_is_raised_when_added_surgery_is_empty(self):
        self.assertRaises(ValueError, self.history.add_surgery, "")

    def test_can_add_medical_conditions_in_family_history_for_one_member(self):
        self.history.add_family_history("father", "condition one")
        family_history = self.history.get_family_history()
        self.assertEqual(1, len(family_history["father"]))
        self.assertEqual("condition one", family_history["father"][0])

    def test_can_add_medical_conditions_in_family_history_for_multiple_family_members(self):
        self.history.add_family_history("father", "condition one")
        family_history = self.history.get_family_history()
        self.assertEqual(1, len(family_history["father"]))
        self.assertEqual("condition one", family_history["father"][0])

        self.history.add_family_history("mother", "condition one")
        family_history = self.history.get_family_history()
        self.assertEqual(1, len(family_history["mother"]))
        self.assertEqual("condition one", family_history["mother"][0])

        self.history.add_family_history("brother", "condition one")
        family_history = self.history.get_family_history()
        self.assertEqual(1, len(family_history["brother"]))
        self.assertEqual("condition one", family_history["brother"][0])

        self.history.add_family_history("sister", "condition one")
        family_history = self.history.get_family_history()
        self.assertEqual(1, len(family_history["sister"]))
        self.assertEqual("condition one", family_history["sister"][0])

    def test_can_add_medical_conditions_twice_in_family_history_for_one_member(self):
        self.history.add_family_history("father", "condition one")
        self.history.add_family_history("father", "condition two")
        family_history = self.history.get_family_history()
        self.assertEqual(2, len(family_history["father"]))
        self.assertEqual("condition one", family_history["father"][0])

    def test_value_error_is_raised_when_condition_is_empty(self):
        self.assertRaises(ValueError, self.history.add_family_history, "father", "")

    def test_value_error_is_raised_if_family_history_condition_year_is_added_but_outside_range_1900to2025(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_family_history("father", "condition one-2026")
        self.assertEqual("Invalid! Use format: condition or condition - YYYY (1900–2025)", str(context.exception))

        with self.assertRaises(ValueError) as context:
            self.history.add_family_history("father", "condition one-1899")
        self.assertEqual("Invalid! Use format: condition or condition - YYYY (1900–2025)", str(context.exception))

    def test_value_error_is_raised_when_a_new_family_member_is_added(self):
        with self.assertRaises(ValueError) as context:
            self.history.add_family_history("uncle", "condition one")
        self.assertEqual("Family member must be either father, mother, brother, or sister", str(context.exception))

    def test_date_of_last_visit_is_correct(self):
        self.assertEqual("26/07/2025", self.history.get_last_visit_date())

    def test_date_of_last_visit_cannot_be_in_the_future(self):
        self.assertEqual("26/07/2025", self.history.get_last_visit_date())

        with self.assertRaises(ValueError) as context:
            self.history.set_last_visit_date(datetime.strptime("26/07/2025", "%d/%m/%Y"))
        self.assertEqual("Last visit date must be before today", str(context.exception))


if __name__ == '__main__':
    unittest.main()
