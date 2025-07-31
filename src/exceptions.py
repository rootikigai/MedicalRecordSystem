class MedicalRecordException(Exception):
    pass
class InvalidEmailException(MedicalRecordException):
    pass
class InvalidPhoneException(MedicalRecordException):
    pass
class InvalidGenderException(MedicalRecordException):
    pass
class InvalidDateOfBirthException(MedicalRecordException):
    pass
class InvalidAppointmentDateException(MedicalRecordException):
    pass
class InvalidStatusException(MedicalRecordException):
    pass
class InvalidSpecializationException(MedicalRecordException):
    pass
class RecordNotFoundException(MedicalRecordException):
    pass