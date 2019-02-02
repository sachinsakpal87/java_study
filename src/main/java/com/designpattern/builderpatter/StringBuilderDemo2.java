package com.designpattern.builderpatter;

import java.util.ArrayList;
import java.util.Collections;

class HTMLElement {
	final int indent = 2;
	String name, text;
	ArrayList<HTMLElement> elements = new ArrayList<>();
	String newLine = System.lineSeparator();

	public HTMLElement() {
	}

	public HTMLElement(String name, String text) {
		this.name = name;
		this.text = text;
	}

	@Override
	public String toString() {
		return toStringImpl(0);
	}

	private String toStringImpl(int indentSize) {
		StringBuilder sb = new StringBuilder();
		String i = String.join("", Collections.nCopies(indent * indentSize, " "));
		sb.append(String.format("%s<%s>%s", i, name, newLine));
		if (text != null && !text.isEmpty()) {
			sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
					.append(text)
					.append(newLine);
		}

		for (HTMLElement e : elements) {
			sb.append(e.toStringImpl(indent + 1));
		}

		sb.append(String.format("%s</%s>%s", i, name, newLine));
		return sb.toString();
	}
}

class HtmlBuilder {
	HTMLElement root = new HTMLElement();

	HtmlBuilder(String rootName) {
		root.name = rootName;
	}

	public HtmlBuilder addElement(String name, String text) {
		final HTMLElement htmlElement = new HTMLElement(name, text);
		root.elements.add(htmlElement);
		return this; //Returning pointer to this of same class is called fluent builder.
	}

	@Override
	public String toString() {
		return root.toString();
	}
}

public class StringBuilderDemo2 {
	public static void main(String[] args) {
		final HtmlBuilder rootEle = new HtmlBuilder("ul");
		rootEle
				.addElement("li", "Hello")
				.addElement("li", "World");

		System.out.println(rootEle);
	}
}
