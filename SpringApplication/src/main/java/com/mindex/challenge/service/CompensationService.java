package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;

import java.util.List;

public interface CompensationService {

    List<Compensation> GetCompensationByEmpID(String id);
    Compensation Create(Compensation compensation);
}
