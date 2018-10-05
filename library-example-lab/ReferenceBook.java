package library;

public class ReferenceBook extends LibraryBook {
	private String collection;

	/**
	 * Null constructor
	 */
	ReferenceBook() {

	}

	/**
	 * Standard constructor
	 */
	ReferenceBook(String author, String title, String iSBN, String callNum, String collection) {
		super(author, title, iSBN, callNum);
		this.collection = collection;
	}

	/**
	 * Reports circulation status, always return "non-circulating reference book¡± for ReferenceBook.
	 */
	public String circulationStatus() {
		return "non-circulating reference book";
	}

	/**
	 * Standard getter for field collection
	 * 
	 * @return collection, name of the collection area
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * Standard setter for field collection
	 * @param collection the collection area in which the book is stored
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}

	public void returned() {
		System.out.println("reference book " + super.getCallNumber() + 
				" could not have been checked out -- return impossible \n");
	}

	public void checkout(String patron, String dueDate) {
		System.out.println( patron + " cannot check out a reference book \n");
	}

	/**
	 * Standard toString for printing. Added collection at the end.
	 */
	public String toString() {
		return super.toString() + "\t" + "Collection:  " + collection + "\n";
	}
}
