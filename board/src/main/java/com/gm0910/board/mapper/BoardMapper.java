package com.gm0910.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gm0910.board.domain.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	public void insert(BoardVO board);
	public BoardVO read(Long bno);
	public int delete(Long bno);
	public int update(BoardVO board); //수정이 완료된 보드를 받아야함 . 기존정보는 이미 DB에 있음.
} 
