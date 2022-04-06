package com.es.edu.eoi.model;

import java.util.Date;

public class Message {
	
	private String content;
	
	private User from;
	
	private User to;
	
	private Date time;
	
	private boolean readed;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public Message(String content, User from, User to, Date time) {
		super();
		this.content = content;
		this.from = from;
		this.to = to;
		this.time = time;		
	}
	
	
}
