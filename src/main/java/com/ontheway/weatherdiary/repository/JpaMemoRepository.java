package com.ontheway.weatherdiary.repository;

import com.ontheway.weatherdiary.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
