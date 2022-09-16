package com.personal.nndi.controller.client.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.nndi.model.dto.commondto.BookInfoDTO;
import com.personal.nndi.model.service.client.board.BoardService;

@RestController
@RequestMapping("board")
public class BoardRestController {

	private BoardService boardService;
	
	@Autowired
	public BoardRestController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	
	@GetMapping(produces="application/json; charset=UTF-8")
	@ResponseBody
	public ResponseEntity<?> getBoards(@PageableDefault Pageable pageable) {
		
		BookInfoDTO qnaBoards = boardService.findAll();
		
		System.out.println(qnaBoards);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
