package com.Linkedin.ScrapingData.repo;

import com.Linkedin.ScrapingData.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Long> {

}
