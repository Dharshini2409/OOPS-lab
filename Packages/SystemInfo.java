import java.lang.System;
public class SystemInfo {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String user = System.getProperty("user.name");

        System.out.println("Operating System: " + os);
        System.out.println("User: " + user);
    }
}
