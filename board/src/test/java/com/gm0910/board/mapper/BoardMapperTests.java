package com.gm0910.board.mapper;

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
public class BoardMapperTests {
	@Autowired
	private BoardMapper boardMapper;
	
//	@Test
//	public void getListTest() {
//		boardMapper.getList().forEach(log::info);
//	}
	
//	@Test
//	public void insertTest() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성한 글 제목5");
//		board.setContent("새로 작성한 글 내용5");
//		board.setWriter("user05");
//		
//		boardMapper.insert(board);
//		log.info(board);
//	}
//	@Test
//	public void readTest() {
//		BoardVO boardVO = boardMapper.read(6L);
//	}
	@Test
	public void deleteTest() { 
		Long bno = 1L;
		BoardVO boardVO = boardMapper.read(bno);
		if( boardVO!= null) {
			log.info("DELETE COUNT : " + boardMapper.delete(boardVO.getBno()));
			return;
		}
		log.info("NO BOARD");
	}
//		@Test
//		public void updateTest() {
//			//우리가 직접 read를 가져와야한다  
////			BoardVO boardVO = new BoardVO();  이렇게 ㄴㄴ 위에서 만들어놨다 필요한것만 수정 
////			Model객체 를 select해서  
//			BoardVO boardVO = boardMapper.read(2L);
//			if(boardVO != null) {
//				boardVO.setTitle("수정된 제목");
//				boardVO.setContent("수정된 내용");
//				boardVO.setWriter("user00");
//				log.info("UPDATE COUNT : " +boardMapper.update(boardVO));
//				return;
//			}
//			log.info("NO BOARD");
//		}
}
