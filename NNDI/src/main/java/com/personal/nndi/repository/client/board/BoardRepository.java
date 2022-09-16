package com.personal.nndi.repository.client.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.nndi.model.Entity.BookInfo;

@Repository
public interface BoardRepository extends JpaRepository<BookInfo, Integer>{

	BookInfo findByCode(int i);

}
