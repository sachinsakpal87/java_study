//package com.design_pattern.singleton.demo8;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Dictionary;
//import java.util.Hashtable;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import com.google.common.collect.Iterables;
//
//interface Database{
//	Integer getPopulation(String name);
//}
//
//class SingletonDatabase implements Database {
//	private static SingletonDatabase INSTANCE = new SingletonDatabase();
//	private Dictionary<String, Integer> populationTable = new Hashtable<>();
//
////	DemoSingletonSingleObjectRepositoryTest.class.
////	getProtectionDomain().
////	getCodeSource().
////	getLocation().
////	getPath()
//	private SingletonDatabase() {
//		System.out.println("Initializing Database");
//		File file = new File(System.getProperty("user.dir"));
//		Path fullPath = Paths.get(file.getPath() + "\\population.txt");
//		try {
//			List<String> lines = Files.readAllLines(fullPath);
//			Iterables
//					.partition(lines, 2)
//					.forEach(kv ->
//							populationTable.put(kv.get(0).trim(),
//									Integer.parseInt(kv.get(1))));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static SingletonDatabase getInstance() {
//		return INSTANCE;
//	}
//
//	public Integer getPopulation(String name){
//		return populationTable.get(name);
//	}
//}
//
//class ConfigurableRecordFinder {
//	private Database database;
//	ConfigurableRecordFinder(Database database){
//		this.database = database;
//	}
//	public Integer getTotalPopulation(List<String> names){
//		Integer result = 0;
//		for (String name : names){
//			result+=database.getPopulation(name);
//		}
//		return result;
//	}
//}
//
//class DummyDatabase implements Database {
//	private Dictionary<String, Integer> dummyPopulationTable = new Hashtable<>();
//	DummyDatabase(){
//		dummyPopulationTable.put("alpha",10);
//		dummyPopulationTable.put("beata",20);
//		dummyPopulationTable.put("gamma",30);
//	}
//	public Integer getPopulation(String name) {
//		return dummyPopulationTable.get(name);
//	}
//}
//
//class SingletonRecordFinder{
//	public Integer getTotalPopulation(List<String> names){
//		Integer result = 0;
//		for (String name : names){
//			result+= SingletonDatabase.getInstance().getPopulation(name);
//		}
//		return result;
//	}
//}
//
//public class DemoSingletonSingleObjectRepositoryTest {
//	@Test
//	public void testpopulation(){
//		SingletonRecordFinder recordFinder = new SingletonRecordFinder();
//
//		Integer total = recordFinder.getTotalPopulation(List.of("PUNE","MUMBAI","NAGPUR"));
//		Assert.assertEquals(Integer.valueOf(38000),total);
//	}
//
//	@Test
//	public void testPopulationDummy(){
//		DummyDatabase ddb = new DummyDatabase();
//		ConfigurableRecordFinder cRf = new ConfigurableRecordFinder(ddb);
//		Integer total = cRf.getTotalPopulation(List.of("alpha","gamma"));
//		Assert.assertEquals(Integer.valueOf(40),total);
//	}
//}
