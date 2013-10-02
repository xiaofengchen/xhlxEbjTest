package com.xhlx;

import java.util.*;

public class UseCase3 <T>{
public void doSomething(UseCase3<? extends List> a){
System.out.println(a.getClass().getName());
}
public void print(T t){
System.out.println(t.getClass().getName());
}

public static void main(String[] args) {

UseCase3<? extends List> a=new UseCase3<ArrayList>();
a.doSomething(new UseCase3<ArrayList>());
a.doSomething(new UseCase3<LinkedList>());
UseCase3 b = new UseCase3<ArrayList>();
b.print(new UseCase3<ArrayList>());
UseCase3<Object> a2=new UseCase3<Object>();
a2.print(a2);

}
}
