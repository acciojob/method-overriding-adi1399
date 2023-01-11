package com.driver;
import java.util.*;

 class A{
  public void meth(){
    System.out.println("Invoking method from class A");
  }
}

 class B extends A{
  B(){
    super.meth();
  }
  public void meth(){
    System.out.println("Method is overridden in Extendend class B");
  }
}

public class Main {
	public static void main(String[] args){
  B obj=new B();
		obj.meth();
	}
}
