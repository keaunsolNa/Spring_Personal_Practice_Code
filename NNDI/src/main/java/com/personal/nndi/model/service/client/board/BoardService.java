package com.personal.nndi.model.service.client.board;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.personal.nndi.model.dto.commondto.BookInfoDTO;

public interface BoardService {

	BookInfoDTO findAll();

}
