package by.anton.pattern.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgrammLogger.getProgrammLogger().addLogInfo("First info add");
        ProgrammLogger.getProgrammLogger().addLogInfo("Second info add");
        ProgrammLogger.getProgrammLogger().addLogInfo("Thirst info add");
        ProgrammLogger.getProgrammLogger().showLogFile();
    }
}
