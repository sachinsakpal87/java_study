package com.collections.collection;

// NUmber of duplicate words and its count
//Find max count

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InterviewQuestionHashMap {

	InterviewQuestionHashMap() {

	}
	public static void main(String[] args) {
		String[] nameProvider = { "john", "cena", "Raj", "Ravi", "Mark", "Craig", "Han", "Joseph", "Jeevan", "Jack" };
		Random rand = new Random();
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			arrayList.add(nameProvider[rand.nextInt(10)]);
		}

		HashMap<String, Integer> wordsMapWithCount = new HashMap<>();

        for (String word : arrayList){
            if(wordsMapWithCount.containsKey(word)){
                wordsMapWithCount.put(word,(wordsMapWithCount.get(word))+1);
            }else {
                wordsMapWithCount.put(word,1);
            }
        }

//		for (String word : arrayList) {
//			wordsMapWithCount.putIfAbsent(word, 0);
//			wordsMapWithCount.computeIfPresent(word, (k, v) -> {
//				v = v + 1;
//				return v;
//			});
//		}

//        arrayList.stream().filter( we->wordsMapWithCount.keySet().stream().filter(pe->pe.contains(we)))

//        Set<Map.Entry<String,Integer>> entrySet  = wordsMapWithCount.entrySet();
//
//        System.out.println("Entry set vaues"+entrySet);
//        List<Map.Entry<string_demo,Integer>> listOfEntry = new ArrayList<>(entrySet);

		List<Map.Entry<String, Integer>> listOfEntry = new ArrayList<>(wordsMapWithCount.entrySet());

        Collections.sort(listOfEntry, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -(o1.getValue().compareTo(o2.getValue()));
            }
        });

//		Collections.sort(listOfEntry, (o1, o2) -> {
//			return o1.getValue().compareTo(o2.getValue());
//		});

		//Multiplying with -1 for descending order
//		listOfEntry.sort((o1, o2) -> -1 * (o1.getValue().compareTo(o2.getValue())));

//        Collections.sort(listOfEntry, Comparator.comparing(Map.Entry::getValue));

		System.out.println(listOfEntry);
		System.out.println(listOfEntry.get(0).getValue());
	}
}
