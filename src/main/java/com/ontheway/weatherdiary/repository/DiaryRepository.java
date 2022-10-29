package com.ontheway.weatherdiary.repository;

import com.ontheway.weatherdiary.domain.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer>{

}
