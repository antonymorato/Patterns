package kpi.iasa;

public class Singletone {

    public static void main(String[] args) {
        ProgrammLogger.getProgrammLogger().addLogInfo("First log...");
        ProgrammLogger.getProgrammLogger().addLogInfo("Second log...");
        ProgrammLogger.getProgrammLogger().addLogInfo("Third log...");

        ProgrammLogger.getProgrammLogger().showLogFile();
    }

}

class ProgrammLogger{
    private static ProgrammLogger programmLogger;
    private static String logFile="Log file. \n\n";

    public static ProgrammLogger getProgrammLogger()
    {
        if (programmLogger==null)
            programmLogger=new ProgrammLogger();

        return programmLogger;
    }

    public void addLogInfo(String info)
    {
        logFile+=info+"\n";
    }

    public void showLogFile()
    {
        System.out.println(logFile);
    }

}