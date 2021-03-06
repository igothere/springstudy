package com.example.demo.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {

  Long seq;

  String content;

  String title;

  Timestamp rgstr_date;

  Timestamp updt_date;

  String user_id;

  int view_cnt;
  
}
