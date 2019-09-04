package logger.bayramoff.com;

import android.util.Log;

public class Logger {

    private static String Tag = "LoggerLib";
    private static boolean isDebug = true;

    public static void log(String message)
    {
        if (isDebug) Log.d(Tag, message);
    }
    public static void init(String tag)
    {
        Tag = tag;
    }
    public static void debug(boolean debug)
    {
        isDebug = debug;
    }

}
