package com.programing.class5;

public class mygeneralized_class<T> {

	T obj;

	void add(T obj) {
		this.obj = obj;

	}

	T get() {
		return obj;
	}

	public class UseOfGenerics {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/////////////////////
			mygeneralized_class<Integer> intType = new mygeneralized_class<>();
			intType.add(21);
			intType.add(31);
			System.out.println(intType.get());

///////////////////////////////
			mygeneralized_class<Boolean> boolType = new mygeneralized_class<>();
			boolType.add(true);
			System.out.println(boolType.get());
		}

	}
}
