package design.patterns.factorymethod;

public class LoggerFactory {

	public static ILogger createLogger() {
		return new  FileLogger();
	}
}
