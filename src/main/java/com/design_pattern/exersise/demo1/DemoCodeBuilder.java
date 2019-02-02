package com.design_pattern.exersise.demo1;

import java.util.ArrayList;
import java.util.List;

class Fields{
	String name;
	String type;

	public Fields(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return String.format("public %s %s;",type,name);
	}
}

class Class{
	String className;
	List<Fields> fields = new ArrayList<>();
	String lineSeperator = System.lineSeparator();

	public Class(String className) {
		this.className = className;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class "+this.className).append(lineSeperator).append("{").append(lineSeperator);;
		for (Fields field : fields){
			sb.append(" "+field.toString()).append(lineSeperator);
		}
		sb.append("}").append(lineSeperator);
		return sb.toString();
	}
}

class CodeBuilder
{
	Class className;

	public CodeBuilder(String className){
		this.className = new Class(className);
	}

	public CodeBuilder addField(String name, String type){
		Fields field = new Fields(name,type);
		className.fields.add(field);
		return this;
	}

	public String toString() {
		return className.toString();
	}
}

public class DemoCodeBuilder {
	public static void main(String[] args) {
		CodeBuilder cb = new CodeBuilder("Person")
				.addField("name","string_demo")
				.addField("age","int");
		System.out.println(cb);

		cb = new CodeBuilder("Foo");
		System.out.println(cb);
	}
}
