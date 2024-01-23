package root;

public class MyClass<E> {
	private E attribute;

	MyClass(E invar) {
		this.attribute = invar;
	}

	public E get() {
		return this.attribute;
	}

	public void set(E value) {
		this.attribute = value;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof MyClass<?>) {
			if (this.get() == null) {
				return this.get() == ((MyClass<E>) other).get();
			} else {
				return this.get().equals(((MyClass<E>) other).get());
			}
		} else {
			return false;
		}
	}
}