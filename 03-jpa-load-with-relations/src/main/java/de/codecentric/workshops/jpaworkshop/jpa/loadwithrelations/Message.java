package de.codecentric.workshops.jpaworkshop.jpa.loadwithrelations;

public class Message {
	private long id;
	private User sender;
	private String receiver;
	private String content;

	public Message() {
	}

	public Message(long id, User sender, String receiver, String content) {
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
