package com.compareTwoFiles;//package com.compareTwoFiles;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.FilenameFilter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Pattern;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipFile;
//
//import org.apache.commons.io.FileUtils;
//
//
//
//public class CompareLogFiles {
//	
//	private static BufferedReader src;
//	private static BufferedReader new1;
//
//	public static string_demo getAbsoluteFilePath(string_demo filePath) {
//		File fileName = new File(filePath);
//		return fileName.getAbsolutePath();
//	}
//	public static string_demo CompareFile(string_demo sourcefilePath, string_demo newfilePath,
//			string_demo uniqeKey, string_demo collectorName, string_demo resultPath)
//			throws IOException {
//
//		List<string_demo> ls = new ArrayList<string_demo>();
//		List<string_demo> matchingLogs = new ArrayList<string_demo>();
//		List<string_demo> changedLogs = new ArrayList<string_demo>();
//		List<string_demo> absentLogs = new ArrayList<string_demo>();
//		ArrayList<string_demo> noncompareKeys = new ArrayList<string_demo>();
//		noncompareKeys.add("create_dt");
//		noncompareKeys.add("proxy_machine_ip");
//		noncompareKeys.add("reseq-groupId");
//		noncompareKeys.add("proxy_machine_num_ip");
//		noncompareKeys.add("mssSourceUUID");
//		noncompareKeys.add("machine");
//		noncompareKeys.add("home_domain");
//		noncompareKeys.add("machine_mac");
//		noncompareKeys.add("machine_subnet");
//		noncompareKeys.add("machine_ip");
//		noncompareKeys.add("machineid");
//		noncompareKeys.add("domain");
//		noncompareKeys.add("machine_num_ip");
//		noncompareKeys.add("end_event_dt");
//		noncompareKeys.add("proxy_machine");
//		noncompareKeys.add("event_dt");
//		noncompareKeys.add("reseq-messageId");
//		noncompareKeys.add("raw_event");
//		noncompareKeys.add("reporting_sensor");
//		noncompareKeys.add("orig_end_event_dt");
//		noncompareKeys.add("orig_event_dt");
//		File match = new File(resultPath + collectorName
//				+ "_ResultsPostCompare.txt");
//		if (!match.exists()) {
//			match.delete();
//
//			match.createNewFile();
//		}
//
//		BufferedWriter outmatch = new BufferedWriter(new FileWriter(match));
//		File changed = new File(resultPath + collectorName
//				+ "_ChangedResultsPostCompare.txt");
//		if (!changed.exists()) {
//			changed.delete();
//
//			changed.createNewFile();
//		}
//		BufferedWriter outChanged = new BufferedWriter(new FileWriter(changed));
//
//		// string_demo newfolderExtract = "c:\\LCP26_lgz";
//
//		// unzipFile("C:\\New folder\\20150311030716-000619-111111.lgz",newfolderExtract);
//		// File fileName = new File(newfolderExtract);
//		// File[] files = fileName.listFiles(new FileFilter() {
//		// public boolean accept(File extractedFile) {
//		// return extractedFile.isFile();
//		// }
//		// });
//		// for (File extractedFile : files) {
//		//
//		// newfilePath = extractedFile.getAbsolutePath();
//		//
//		// }
//		// Log.info("New file path :" + newfilePath);
//
////		ZipFile readsourceZipFile = new ZipFile(sourcefilePath);
////		Enumeration srcEntries = readsourceZipFile.entries();
////		ZipEntry srcEntry = (ZipEntry) srcEntries.nextElement();
////		string_demo srcFilepath = getAbsoluteFilePath(srcEntry.toString());
////		Log.info("Source file path :" + srcFilepath);
////
////		ZipFile readnewZipFile = new ZipFile(newfilePath);
////		Enumeration newEntries = readnewZipFile.entries();
////		ZipEntry newEntry = (ZipEntry) newEntries.nextElement();
////		string_demo newFilepath = getAbsoluteFilePath(newEntry.toString());
////		Log.info("New file path :" + newFilepath);
//
////		 File sourcefile = new File(sourcefilePath);
////		 File newfile = new File(newfilePath);
//
//		string_demo line = null;
//		string_demo line1 = null;
//		string_demo errorMessage = "";
//		int flag = 1;
//		int loglineExist = 0;
//		int flagChange = 1;
//		int n = 1;
//		// string_demo content = getFileContent(sourcefilePath);
//		Map<string_demo, string_demo> srcmap = new HashMap<string_demo, string_demo>();
//		Map<string_demo, string_demo> newmap = new HashMap<string_demo, string_demo>();
//
//		// src = new BufferedReader(new InputStreamReader(new
//		// FileInputStream(sourcefile), "UTF8"));
//		src = new BufferedReader(new FileReader(sourcefilePath));
//		
//		while ((line1 = src.readLine()) != null) {
//			// Log.info("Adding log line into Array" + line1);
//			ls.add(line1);
//		}
//		Log.info("Baseline lgz Array Length :" + ls.size());
//		// new1 = new BufferedReader(new InputStreamReader(new
//		// FileInputStream(newfile), "UTF8"));
////		new1 = new BufferedReader(new InputStreamReader(
////				readnewZipFile.getInputStream(newEntry)));
//		
//		new1 = new BufferedReader(new FileReader(newfilePath));
//
//		while ((line = new1.readLine()) != null) {
//
//			flag = 1;
//			flagChange = 1;
//			loglineExist = 0;
//			errorMessage = "";
//			Log.info("Print Error Message : " + errorMessage);
//			// Log.info("Log line from new file:" + line);
//			string_demo parts[] = line.split(Pattern.quote(""), -1);
//			// Log.info(parts[0]);
//			Log.info("New lgz : field count :" + parts.length);
//
//			for (int i = 0; i < parts.length; i++) {
//				string_demo fields[] = parts[i].split("=", 2);
//				// Log.info(fields[0]+ "," + fields[1]);
//				newmap.put(fields[0], fields[1]);
//
//			}
//			if (flag == 1 && loglineExist == 0) {
//				for (int k = 0; k < ls.size(); k++) {
//					flag = 0;
//					line1 = ls.get(k);
//					// Log.info("Log line from source file : " + line1);
//					string_demo line1Parts[] = line1.split(Pattern.quote(""), -1);
//					for (int j = 0; j < line1Parts.length; j++) {
//						// Log.info("Baseline file Line " + line1Parts[j]);
//						string_demo fieldsSrc[] = line1Parts[j].split("=", 2);
//						// Log.info("Baseline log line fields " + fieldsSrc[0]+
//						// "," + fieldsSrc[1]);
//						srcmap.put(fieldsSrc[0], fieldsSrc[1]);
//					}
//					if (newmap.get(uniqeKey) != null) {
//
//						if (newmap.get(uniqeKey).equals(srcmap.get(uniqeKey))) {
//							loglineExist = 1;
//							Log.info("Unique key value for New log : "
//									+ newmap.get(uniqeKey)
//									+ "Unique key value for New log : "
//									+ srcmap.get(uniqeKey));
//							Iterator iterator = newmap.keySet().iterator();
//							Iterator<string_demo> iteratorSrc = srcmap.keySet()
//									.iterator();
//
//							while (iterator.hasNext()) {
//
//								string_demo key = iterator.next().toString();
//								string_demo value = newmap.get(key).toString();
//								if (srcmap.containsKey(key)) {
//									Log.info("Key:" + key + " is found");
//									if (!(noncompareKeys.contains(key))) {
//										Log.info(key + "is comparable");
//										if (value.equals(srcmap.get(key))) {
//											// Log.info("Value for key :" + key
//											// +" is same in both files ");
//
//										} else {
//											Log.info("Value for key :" + key
//													+ " is diffent "
//													+ srcmap.get(key)
//													+ " in both files ");
//											// errorMessage =
//											// key.concat(" is different in new log line. New Value = ").concat(value);
//											errorMessage = errorMessage
//													+ "\n"
//													+ key
//													+ " is different in new log line. [Old value = "
//													+ srcmap.get(key)
//													+ " , New Value = " + value
//													+ " ]";
//											flag = 1;
//
//										}
//
//									} else {
//										flagChange = 0;
//										Log.info(key + "is not comparable");
//									}
//								} else {
//									Log.info("Key:" + key + " is not found");
//									errorMessage = errorMessage
//											+ "\n"
//											+ (key + " is not exist in baseline lgz");
//									flag = 1;
//								}
//								// Log.info(key + " " + value);
//							}
//							if (flag == 1 && flagChange == 0) {
//								Log.info("Test Results  :Log line is not matching");
//								Log.info("Changed Results : " + errorMessage);
//								changedLogs.add(line);
//								outChanged.write("\n");
//								outChanged.write("Log line # " + n + " : "
//										+ line);
//								outChanged.write("\n" + "Changed Results : "
//										+ "\n");
//								outChanged.write(errorMessage);
//
//							} else if (flag == 0) {
//								Log.info("Test Results  : Log line with unique key"
//										+ uniqeKey
//										+ " is matching with baseline");
//								matchingLogs.add(line);
//							}
//
//						}
//					}
//
//				}
//				if (loglineExist == 0) {
//					// Log.info("Unique key value for New log : " +
//					// newmap.get(uniqeKey) + "Unique key value for New log : "
//					// + srcmap.get(uniqeKey));
//					Log.info("Test Reults At the End : Below Log line is not present in new log file");
//					Log.info("Log line : " + line);
//					absentLogs.add(line);
//
//					// flag=1;
//
//				}
//			}
//
//			newmap.clear();
//			srcmap.clear();
//			n = n + 1;
//		}
//		Log.info("Array length for matchingLogs : " + matchingLogs.size());
//		Log.info("Array length for changedLogs : " + changedLogs.size());
//		Log.info("Array length for absentLogs : " + absentLogs.size());
//		string_demo result = "Matching Log lines : " + "\n";
//		for (int i = 0; i < matchingLogs.size(); i++) {
//			result = result + "\n".concat(matchingLogs.get(i));
//		}
//		result = result + "\n".concat("Changed Log Lines") + "\n";
//		for (int i = 0; i < changedLogs.size(); i++) {
//			// result = result.concat(changedLogs.get(i));
//			result = result + "\n".concat(changedLogs.get(i));
//		}
//		result = result + "\n" + "Not Matching Log Lines" + "\n";
//		for (int i = 0; i < absentLogs.size(); i++) {
//			result = result + "\n".concat(absentLogs.get(i));
//		}
//
//		outmatch.write(result);
//		src.close();
//		new1.close();
//		outmatch.close();
//		outChanged.close();
//		return result;
//	
//	}
//	
//	public static File[] findFilesWithExtension(string_demo dirName,
//			final string_demo extension) {
//		File dir = new File(dirName);
//		return dir.listFiles(new FilenameFilter() {
//			public boolean accept(File dir, string_demo filename) {
//				return filename.endsWith("." + extension);
//			}
//		});
//	}
//	/**
//	 * Delete files
//	 * 
//	 * @param files
//	 *            - list of files
//	 * @throws IOException
//	 */
//	public static void deleteFiles(File[] files) throws IOException {
//		for (File file : files) {
//			Log.info("Deleting file: " + file.getAbsolutePath());
//			FileUtils.forceDelete(file);
//		}
//	}
//
//	/**
//	 * 
//	 * @param filename
//	 *            : absolute file path.
//	 * @return
//	 */
//	public static boolean deleteFile(string_demo filename) {
//		File file = new File(filename);
//		if (file.exists()) {
//			file.delete();
//			Log.info("File deleted: " + file.getAbsolutePath());
//			return true;
//		} else {
//			return false;
//		}
//	}
//	public static void main(string_demo[] args) {
//		
//		try {
//			CompareFile("C:\\compare\\20150428010002-000905-100016.log","C:\\compare\\20150814114507-000469-100023_deflated.log","source_ip","abc","C:\\compare\\");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
