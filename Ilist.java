public interface IList<E> extends Iterable<E>{

	
	void add(E item);

	
	void insert(int pos, E item);

	
	E set(int pos, E item);

	
	E get(int pos);


	
	E remove(int pos);
	
	
	boolean remove(E obj);
	
	
	IList<E> getSubList(int start, int stop);

	
	int size();

	
	int indexOf(E item);

	/**
	 * find the position of an element in the list starting at a specified position.
	 * <br>pre: 0 <= pos < size()
	 * <br>post: return the index of the first element equal to item starting at pos
	 * or -1 if item is not present from position pos onward
	 * @param item the element to search for in the list
	 * @param pos the position in the list to start searching from
	 * @return starting from the specified position return the index of the first element equal to item or a -1 if item is not present between pos and the end of the list
	 */
	int indexOf(E item, int pos);

	/**
	 * return the list to an empty state.
	 * <br>pre: none
	 * <br>post: size() = 0
	 */
	void makeEmpty();

	/**
	* return an Iterator for this list.
	* <br>pre: none
	* <br>post: return an Iterator object for this List
	*/
    Iterator<E> iterator();

    /**
     * Remove all elements in this list from <tt>start</tt> inclusive to <tt>stop</tt> exclusive.
     * <br>pre: <tt>0 <= start < size(), start <= stop <= size()</tt>
     * <br>post: <tt>size() = old size() - (stop - start)</tt>
     * @param start position at beginning of range of elements to be removed
     * @param stop stop - 1 is the position at the end of the range of elements to be removed
     */
    void removeRange(int start, int stop);
    
    /**
     * Return a String version of this list enclosed in
     * square brackets, []. Elements are in
     * are in order based on position in the 
     * list with the first element
     * first. Adjacent elements are seperated by comma's
     * @return a String representation of this IList
     */
    public String toString();
    
   
    public boolean equals(Object other);
}
