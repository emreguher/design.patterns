package design.patterns.factorymethod;

import java.util.List;

public interface ILogger {
	void writeLog(String logMessage);
	List<String> readLog();
}
