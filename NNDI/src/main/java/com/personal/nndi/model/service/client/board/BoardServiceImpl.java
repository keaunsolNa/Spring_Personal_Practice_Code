package com.personal.nndi.model.service.client.board;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.nndi.model.Entity.BookInfo;
import com.personal.nndi.model.dto.commondto.BookInfoDTO;
import com.personal.nndi.repository.client.board.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	private BoardRepository boardRepository;
	private ModelMapper modelMapper;
	
	@Autowired
	public BoardServiceImpl(BoardRepository boardRepository, ModelMapper modelMapper) {
		this.boardRepository = boardRepository;
		this.modelMapper = modelMapper;
	}
	
	@Override
	public BookInfoDTO findAll() {
		 
		System.out.println("SERVICE IMP 출력 확인");
		
		BookInfo bookList = boardRepository.findByCode(1);
		System.out.println("TEST L " + bookList);
		return modelMapper.map(bookList, BookInfoDTO.class);
	}

}
