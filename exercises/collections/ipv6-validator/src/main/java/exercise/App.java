package exercise;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.stream.Stream;

public class App {

    public static boolean isValidIPv6(String ip) {
        if (ip.endsWith(":") && !ip.endsWith("::")) {
            return false;
        }

        if (!ip.contains(":")) {
            return false;
        }

        if (ip.indexOf("::") != ip.lastIndexOf("::")) {
            return false;
        }

        String[] groups = ip.split(":");

        if (groups.length > 8) {
            return false;
        }

        if (groups.length == 8 && ip.contains("::")) {
            return false;
        }

        String replacement = ip.startsWith("::") ? "0:" : ":0:";
        String formattedIP = ip.replace("::", replacement);
        String[] formattedGroups = formattedIP.split(":");

        return Stream.of(formattedGroups)
                .allMatch(App::isValidGroup);
    }

    private static boolean isValidGroup(String group) {
        String hex = "0x" + group;
        return NumberUtils.isCreatable(hex) && group.length() <= 4;
    }
}
