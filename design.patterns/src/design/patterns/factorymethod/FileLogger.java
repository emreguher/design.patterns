package design.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class FileLogger implements ILogger {

	List<String> logs = new ArrayList<>();
	
	@Override
	public void writeLog(String logMessage) {
		System.out.println(logMessage + " dosyaya eklendi");
		logs.add(logMessage);

	}

	@Override
	public List<String> readLog() {
		// TODO Auto-generated method stub
		return logs;
	}

}
