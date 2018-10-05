package library;

public class CirculatingBook extends LibraryBook {
	private String currentHolder;
	private String dueDate;

	/**
	 * Standard constructor
	 * 
	 * @param author  name of the author
	 * @param title   title of the book
	 * @param iSBN    the ISBN code of the book
	 * @param callNum the call number of the book
	 */
	public CirculatingBook(String author, String title, String iSBN, String callNum) {
		super(author, title, iSBN, callNum);
		currentHolder = null;
		dueDate = null;
	}

	/**
	 * Null constructor
	 */
	public CirculatingBook() {

	}

	/**
	 * Standard getter for field currentHolder
	 * 
	 * @return a string indicating name of the current holder
	 */
	public String getCurrentHolder() {
		return currentHolder;
	}

	/**
	 * Standard setter for field currentHolder
	 * 
	 * @param currentHolder name of the patron/borrower
	 */
	public void setCurrentHolder(String patron) {
		currentHolder = patron;
	}

	/**
	 * Standard getter for field dueDate
	 * 
	 * @return dueDate final date that the book should be returned
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Standard Setter for dueDate
	 * 
	 * @param dueDate final date that the book should be returned
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * Gives the current circulation status of the book.
	 * 
	 * @Precondition none.
	 * @Postcondition 1. If the book is not checkout, indicate it is available on
	 *                shelves. 2. If the book is checked out, indicate this status
	 *                with the current holder and the dueDate.
	 */
	public String circulationStatus() {
		if (currentHolder == null && dueDate == null) {
			return "book available on shelves";
		}
		return "book checked out by " + currentHolder + "and due back on " + dueDate;
	}

	/**
	 * handles processing for a patron to check out a book. A due date also is
	 * recorded. 
	 * @Precondition None 
	 * @Postcondition: 1. currentHolder == patron 2.this.dueDate == dueDate
	 * 
	 * @param patron  name of the borrower
	 * @param dueDate final date the book should be returned
	 * 
	 */
	public void checkout(String patron, String dueDate) {
		currentHolder = patron;
		this.dueDate = dueDate;
	}

	/**
	 * handles processing for when a book is returned after having been checked out.
	 * @Precondition£ºNone 
	 * @Postcondition£º currentHolder == null
	 */
	public void returned() {
		// Setting currentHolder and dueDate to null to indicates the book is not
		// checked out.
		currentHolder = null;
		dueDate = null;
	}
}
