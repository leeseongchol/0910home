package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardVO;


@SpringBootTest
class BootBoardApplicationTests {

	@Autowired // 필드주입
	 BoardMapper boardMapper;

	//@Test //등록
	void insertBoardInfo() {
		BoardVO boardVO 
		=  BoardVO.builder()
		.title("First board")
		.writer("tester")
		.regdate(new Date())
		.build();
		System.err.println("before) "+ boardVO.getBno());
		int result = boardMapper.insertBoardInfo(boardVO);
		System.err.println("after)" + boardVO.getBno());
		assertEquals(result,1);
		

	}
	
	@Test //전체조회
	void boardList() {
		List<BoardVO> list =boardMapper.selectBoardAll();
		System.out.println(list.get(0));
	}
	

}