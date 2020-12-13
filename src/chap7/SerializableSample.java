package chap7;

import java.io.Serializable;

public class SerializableSample implements Serializable{
	String name = "川田";

	@Override
	public String toString() {
		return "SerializableSample [name=" + name + "]";
	}



}
