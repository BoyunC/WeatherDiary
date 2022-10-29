package com.ontheway.weatherdiary.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ontheway.weatherdiary.domain.Memo;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class JdbcMemoRepositoryTest {

	@Autowired
	JdbcMemoRepository jdbcMemoRepository;

	@Test
	void insertMemoTest() {
		// given
		Memo newMemo = new Memo(2, "this is memo");
		// when
		jdbcMemoRepository.save(newMemo);
		// then
		Optional<Memo> result = jdbcMemoRepository.findById(2);
		assertEquals(result.get().getText(), "this is memo");
	}

	@Test
	void findAllMemoTest() {
		List<Memo> memoList = jdbcMemoRepository.findAll();
		System.out.println(memoList);
		assertNotNull(memoList);
	}
}