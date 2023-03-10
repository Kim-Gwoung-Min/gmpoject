package com.gm0910.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gm0910.board.domain.vo.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
@Autowired
private BoardService boardService ;

@Test
public void serviceTest() {
	log.info(boardService);
}

@Test
public void registerTest() {
	BoardVO boardVO = new BoardVO();
	boardVO.setTitle("새로 작성한 글 제목");
	boardVO.setContent("새로 작성한 글 내용");
	boardVO.setWriter("gm0910");
	
	boardService.register(boardVO);
	log.info("생성된 게시글 번호 : " + boardVO.getBno());
}
}
