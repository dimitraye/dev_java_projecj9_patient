package com.example.managePatient.service;

import com.example.managePatient.model.Patient;
import com.example.managePatient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements IPatientService{
    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> findPatientById(Integer id) {
        return patientRepository.findById(id);
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        patientRepository.deleteById(id);
    }
}
