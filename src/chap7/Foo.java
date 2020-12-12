package chap7;

import java.io.Serializable;

public class Foo implements Serializable {

	private int x;
	private transient int y;
	private static int z;

	public Foo(int x, int y,int _z) {
		super();
		this.x = x;
		this.y = y;
		z = _z;
	}

	@Override
	public String toString() {
		return x + ":" + y + ":" + z;
	}

}
