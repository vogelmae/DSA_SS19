package de.unistuttgart.vis.dsass2019.ex00.p2;

public class VariableStorage<T> implements IVariableStorage<T> {
	
	private T obj;

	@Override
	public void set(T var) {
		this.obj = var;
	}

	@Override
	public T get() {
		return this.obj;
	}

	

}
