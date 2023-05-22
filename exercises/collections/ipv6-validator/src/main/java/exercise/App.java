package exercise;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.stream.Stream;

public class App {

    public static boolean isValidIPv6(String ip) {
        if (ip.indexOf("::") != ip.lastIndexOf("::")) {
            return false;
        }

        if (!ip.contains(":")) {
            return false;
        }

        if (ip.endsWith(":") && ip.charAt(ip.length() - 2) != ':') {
            return false;
        }

        String[] groups = ip.split(":");

        if (groups.length > 8) {
            return false;
        }

        if (groups.length == 8 && ip.contains("::")) {
            return false;
        }

        String formattedIP;

        if (ip.startsWith("::")) {
            formattedIP = ip.replace("::", "0:");
        } else {

            formattedIP = ip.replace("::", ":0:");
        }

        String[] formattedGroups = formattedIP.split(":");

        return Stream.of(formattedGroups)
                .allMatch(App::isValidGroup);
    }

    private static boolean isValidGroup(String group) {
        return NumberUtils.isCreatable("0x" + group) && group.length() <= 4;
    }
}
