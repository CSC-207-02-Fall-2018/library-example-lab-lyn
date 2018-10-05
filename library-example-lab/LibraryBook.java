package library;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
	private String callNumber;

	/**
	 * Null constructor
	 */
	LibraryBook() {

	}

	/**
	 * Standard constructor
	 * 
	 * @param au name of the author
	 * @param ti title of the book
	 * @param num ISBN code of the book
	 * @param callNum call number of the book
	 */
	LibraryBook(String au, String ti, String num, String callNum) {
		super(au, ti, num);
		callNumber = callNum;
	}

	/**
	 * Standard getter for callNumber
	 * @return call number of the book
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * standard setter for callNumber
	 * @param callNumber
	 */
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	abstract String circulationStatus();

	abstract void checkout(String patron, String dueDate);

	abstract void returned();

	/**
	 * implementation of Comparable's compareTo method
	 * 
	 * @param lib: Library object being compared
	 * @return 0 if call numbers of this and lib match < 0 if call number of this
	 *         comes before call number of lib > 0 otherwise
	 */
	public int compareTo(LibraryBook lib) {
		return callNumber.compareTo(lib.callNumber);
	}

	/**
	 * @return title, author, ISBN, call number as a String for printing
	 */
	public String toString() {
		return super.toString() + "\t" + "Circulation Status:  " + this.circulationStatus() + "\n" + "\t"
				+ "Call Number:  " + callNumber + "\n";
	}
}
