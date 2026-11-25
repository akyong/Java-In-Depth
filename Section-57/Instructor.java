public class Instructor{
	
	public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;

	//this() vs this referenc. this() is first statement;

	public Instructor(long id, String name, String title, String department, Book[] books){
		this(id, name, title, department);
		this.books = books;
	}

	public Instructor(long id, String name, String title, String department){
		this(id, name, title);
		this.department = department;
	}

	public Instructor(long id, String name, String title){
		this(id, name);
		this.title = title;
	}

	public Instructor(long id, String name)
	{
		this.id = id;
		this.name = name;
	}


	public String getMostRecentBookTitle(){
		return books[books.length - 1].getTitle();
	}

	public Book updateBook(int index, String title){
		Book oldBook = new Book(books[index].getTitle());
		books[index].setTitle(title);
		return oldBook;
	}

	public Book updateBook(int index, Book book){
		Book oldBook = books[index];
		books[index] = book;
		return oldBook;
	}


}