package com.DesignPattern.builderpatter;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String[] arr = { "Hello", "World" };
		builder.append("<p> Program </p>\n");
		builder.append("<ul>\n");
		for (String word : arr) {
			builder.append(String.format("<li>%s</li>\n", word));
		}
		builder.append("</ul>");
		System.out.println(builder);
	}
}
