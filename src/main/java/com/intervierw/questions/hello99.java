package com.intervierw.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public class hello99 {

    private static void doGreet(List<String> list, StringBuilder sb, boolean isUpper) {
        if (!list.isEmpty()) {
            if (!sb.toString().equals("")) {
                sb.append(" ");
            }
            String andWord = "";
            String spaceBar = "";
            String temp = "";
            sb.append(isUpper ? "HELLO " : "Hello, ");
            int cnt = list.size();
            for (String name : list) {
                temp += andWord + spaceBar + name;
                spaceBar = " ";
                cnt--;
                andWord = cnt > 1 ? "," : isUpper ? " AND" : " and";
            }
            sb.append(temp).append(isUpper ? "!" : ".");
        }
    }

    static String greet(String name) {
        StringBuilder sb = new StringBuilder();
        List<String> uppercase = new ArrayList<>();
        List<String> lowercase = new ArrayList<>();
        String[] names = name.split(",");
        for (String nam : names) {
            if (nam.isEmpty() || nam.equals(" ")) {
//                nam = "my friend";
                lowercase.add("my friend");
            } else {
//                nam = nam.replace(" ", "");
                nam = nam.trim();
                if (StringUtils.isAllUpperCase(nam)) {
                    uppercase.add(nam);
                } else {
                    lowercase.add(nam);
                }
            }
        }
        doGreet(lowercase, sb, false);
        doGreet(uppercase, sb, true);

//        if (!lowercase.isEmpty()) {
//            String andWord = "";
//            String spaceBar = "";
//            String temp = "";
//            sb.append("Hello, ");
//            int len = lowercase.size();
//            for (String lowerCaseName : lowercase) {
//                temp += andWord+spaceBar+lowerCaseName;
//                spaceBar = " ";
//                len --;
//                andWord = len > 1 ? "," : " and";
//            }
//            sb.append(temp).append(".");
//        }
//        if (!uppercase.isEmpty()) {
//            if(!sb.toString().equals("")){
//                sb.append(" ");
//            }
//            String andWord = "";
//            String spaceBar = "";
//            String temp = "";
//            sb.append("HELLO ");
//            int len = uppercase.size();
//            for (String upperCaseName : uppercase) {
//                temp += andWord+spaceBar+upperCaseName;
//                spaceBar = " ";
//                len--;
//                andWord = len > 1 ? "," : " AND";
//            }
//            sb.append(temp).append("!");
//        }
        return sb.toString();
    }
    // ---- Driver (Main) - Entrypoint for tests ---- //

    public static void main(String[] args) {
        hello99 kata = new hello99();

        kata.c0__hello_jake();
        kata.c0__hello_charles();

        kata.c1__hello_my_friend();

        kata.c2__hello_shouter();

        kata.c3__hello_both();
        kata.c3__hello_both_unspaced();
        kata.c3__hello_both_shouters();
        kata.c3__hello_raymond_and_my_friend();

        kata.c4__hello_all();
        kata.c4__hello_all_and_my_friend();

        kata.c5__hello_both_and_shouter();
        kata.c5__both_and_both_shouters();
        kata.c5__hello_scully_and_both_shouters();
        kata.c5__both_and_all_shouters();
    }

    // ---- Kata Begins ---- //

    void c0__hello_jake() {
        assertEquals(testCase(new Object() {
        }), "Hello, Jake.", greet("Jake"));
    }

    void c0__hello_charles() {
        assertEquals(testCase(new Object() {
        }), "Hello, Charles.", greet(" Charles "));
    }

    void c1__hello_my_friend() {
        assertEquals(testCase(new Object() {
        }), "Hello, my friend.", greet(""));
    }

    void c2__hello_shouter() {
        assertEquals(testCase(new Object() {
        }), "HELLO TERRY!", greet("TERRY"));
    }

    void c3__hello_both() {
        assertEquals(testCase(new Object() {
        }), "Hello, Amy and Rosa.", greet("Amy, Rosa"));
    }

    void c3__hello_both_unspaced() {
        assertEquals(testCase(new Object() {
        }), "Hello, Amy and Rosa.", greet("Amy,Rosa"));
    }

    void c3__hello_both_shouters() {
        assertEquals(testCase(new Object() {
        }), "HELLO AMY AND ROSA!", greet("AMY, ROSA"));
    }

    void c3__hello_raymond_and_my_friend() {
        assertEquals(testCase(new Object() {
        }), "Hello, Raymond and my friend.", greet("Raymond, "));
    }

    void c4__hello_all() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Gina, Jake and Charles.",
                greet("Gina, Jake, Charles"));
    }

    void c4__hello_all_and_my_friend() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Gina, my friend and Charles.",
                greet("Gina, , Charles"));
    }

    void c5__hello_both_and_shouter() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Raymond and Charles. HELLO TERRY!",
                greet("Raymond, TERRY, Charles"));
    }

    void c5__both_and_both_shouters() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Rosa and Charles. HELLO TERRY AND GINA!",
                greet("Rosa, TERRY, Charles, GINA"));
    }

    void c5__hello_scully_and_both_shouters() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Scully. HELLO TERRY AND GINA!",
                greet("Scully, TERRY, GINA"));
    }

    void c5__both_and_all_shouters() {
        assertEquals(testCase(new Object() {
                }),
                "Hello, Raymond and Amy. HELLO HITCHCOCK, SCULLY AND GINA!",
                greet("Raymond, HITCHCOCK, SCULLY, Amy, GINA"));
    }

    // ---- End of Kata ---- //

    private void assertEquals(String testCase, String expected, String actual) {
        if (!Objects.equals(expected, actual)) {
            System.err.println("FAILED Test ".concat(testCase)
                    .concat(" => [ Expected = \"").concat(expected)
                    .concat("\", Actual = \"").concat(actual)
                    .concat("\" ]"));
        } else {
            System.out.println("PASSED Test ".concat(testCase));
        }
    }

    private String testCase(Object o) {
        return o.getClass().getEnclosingMethod().getName();
    }
}
