package com.Linkedin.ScrapingData.service.impl;

import com.Linkedin.ScrapingData.entity.UserData;
import com.Linkedin.ScrapingData.repo.UserDataRepo;
import com.Linkedin.ScrapingData.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepo userDataRepo;
    @Override
    public String storeData(List<UserData>  userData) {
        userDataRepo.saveAll(userData);
        return "Data stored";
    }
}
