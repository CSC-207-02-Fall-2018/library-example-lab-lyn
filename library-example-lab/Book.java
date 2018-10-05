package library;

public class Book {
	protected String author;
	protected String title;
	protected String ISBN;

	/**
	 * Null constructor
	 */
	Book() {
	}

	/**
	 * Standard constructor
	 * 
	 * @param author name of the author of the book
	 * @param title title of the book
	 * @param iSBN the ISBN code for the book
	 */
	Book(String author, String title, String iSBN) {
		this.author = author;
		this.title = title;
		ISBN = iSBN;
	}

	/**
	 * Standard getter for field author
	 * @return name of the author of the book
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * Standard setter for field author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Standard getter for field title
	 * @return title of the book.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Standard setter for field title
	 * @param title of the book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Standard getter for field  ISBN
	 * @return unique ISBN code of the book.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Standard setter for field ISBN
	 * @param iSBN, unique ISBN code of the book
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Standard toString method for printing.
	 */
	public String toString() {
		return "Title:  " + title + "\n" + "\t" + "Author:  " + author + "\n" + "\t" + "ISBN:  " + ISBN + "\n";
	}

}
