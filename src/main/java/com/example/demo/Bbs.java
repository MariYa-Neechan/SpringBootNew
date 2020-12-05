package com.example.demo;
//Day23_HW_簡易BBSを作る


import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table
public class Bbs {
	//主キー（登録番号）
	@Id @GeneratedValue(strategy = GenerationType.AUTO)@Column
	private long id;
	//名前
	@Column(length = 10, nullable = false)
	private String name;
	//コメント
	@Column(length = 130, nullable = false)
	private String comment;
	//投稿日時
	private Timestamp time;
	
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getComment() {return comment;}
	public void setComment(String comment) {this.comment = comment;}
	
	public Timestamp getTime() {return time;}
	public void setTime(Timestamp time) {this.time = time;}
	
	
}
