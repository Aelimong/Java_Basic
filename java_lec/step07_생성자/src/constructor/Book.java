package constructor;

public class Book {
	private String title;
	private String author;
	private int page;
	
	public Book() { //����Ʈ ������
		super();
	}
	public Book(String title, String author, int page) {
		super();
		this.title=title;
		this.author=author;
		this.page=page;
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return title + "�� ���ڴ�" + author + "�̰�, " + page + "�������� ������";
	}
}
