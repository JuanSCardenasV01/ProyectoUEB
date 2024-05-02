package co.edu.unbosque.model.persistence;

public interface CRUDOperation<E> {
	public void create(E data);

	public String readAll();

	public String update(int index, E newData);

	public String delete(int index);
}
