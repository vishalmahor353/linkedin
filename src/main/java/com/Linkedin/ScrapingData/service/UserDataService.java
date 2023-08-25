package com.Linkedin.ScrapingData.service;

import com.Linkedin.ScrapingData.entity.UserData;

import java.util.List;

public interface UserDataService {
     String storeData(List<UserData>  userData);
}
