package ch12_generic.sec08;

public class Board {
	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return subject + "\t" + content + "\t" + writer;
	}
	
}
