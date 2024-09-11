package com.yedam.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;


@Data
//@NoArgsConstructor
@Builder
public class BoardVO {
	private Integer bno;      // 게시글번호
	private String title;     // 제목
	private String contents;  // 내용
	private String writer;    // 작성자
	
	private Date regdate;     // 등록날짜
	private Date updatedate;  // 수정날짜
	private String image;     // 첨부이미지

}
