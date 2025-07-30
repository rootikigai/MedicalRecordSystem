from datetime import datetime
from src.patient import *
from src.doctor import *
from src.exceptions import *

class Appointment:
    def __init__(self, appointment_id: str, patient: Patient, doctor: Doctor, date_time: datetime, status: str = "Scheduled"):
        self._appointment_id = appointment_id
        self._patient = patient
        self._doctor = doctor
        self._date_time = self._validate_date_time(date_time)
        self._status = self._validate_status(status)

    def _validate_date_time(self, date_time: datetime) -> datetime:
        if date_time < datetime.now():
            raise InvalidAppointmentDateException("Why you dey choose past date??? No whyne me na!")
        return date_time

    def _validate_status(self, status: str) -> str:
        valid_statuses = ["Scheduled", "Confirmed", "Cancelled", "Completed"]
        normalized_status = status.strip().capitalize()
        if normalized_status not in valid_statuses:
            raise InvalidStatusException(f"Invalid status: {status}. Must be one of {valid_statuses}")
        return normalized_status

    def get_appointment_id(self) -> str:
        return self._appointment_id

    def get_patient(self) -> Patient:
        return self._patient

    def get_doctor(self) -> Doctor:
        return self._doctor

    def get_date_time(self) -> datetime:
        return self._date_time

    def get_status(self) -> str:
        return self._status

    def set_status(self, status: str) -> None:
        self._status = self._validate_status(status)

    def __str__(self) -> str:
        return f"Appointment {self._appointment_id}: {self._patient.getId()} with {self._doctor.get_id()} on {self._date_time.strftime('%Y-%m-%d %H:%M')} ({self._status})"

    def get_info(self) -> dict:
        return {
            "appointment_id": self._appointment_id,
            "patient_id": self._patient.getId(),
            "doctor_id": self._doctor.get_id(),
            "date_time": self._date_time.strftime("%Y-%m-%d %H:%M"),
            "status": self._status
        }