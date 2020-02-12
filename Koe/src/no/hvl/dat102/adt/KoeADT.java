package no.hvl.dat102.adt;

public interface KoeADT<T> {

	/**
	 * @param element that you want to add in the back of the queue
	 */
	public void innKoe(T element);

	/**
	 * @return T element that taken out from the first position in the queue
	 */
	public T utKoe();

	/**
	 * @return T element giving a reference to the first element in the queue,
	 *         without removing the element
	 */
	public T first();

	/**
	 * @return boolean: true if empty and false if not
	 */
	public boolean isEmpty();

	/**
	 * @return integer representing
	 */
	public int amount();

}
