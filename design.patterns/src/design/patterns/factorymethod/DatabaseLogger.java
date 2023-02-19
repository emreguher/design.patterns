package design.patterns.factorymethod;

import java.util.*;

public class DatabaseLogger implements ILogger {
	// interface
	List<String> logs = new ArrayList<>(); // concrete class
	
	@Override
	public void writeLog(String logMessage) {
		System.out.println(logMessage + " veritabanına eklendi");
		logs.add(logMessage);
	}

	@Override
	public List<String> readLog() {
		System.out.println("Veritabaından loglar çekiliyor...");
		return logs;
	}

}
