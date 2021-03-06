package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
  
  @Autowired
  private BoardMapper bm;

  @Override
  public int insert(Board board) {
    return bm.insertBoard(board);
  }
  
}
