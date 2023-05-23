package exercise;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;
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

        return Stream.of(formattedGroups).allMatch(App::isValidGroup);
    }

    public static boolean isValidIPv62(String ip) {
        if (ip.indexOf("::") != ip.lastIndexOf("::")) {
            return false;
        }

        List<String> groups = Stream.of(ip.split("::"))
                .filter(group -> !group.isEmpty())
                .flatMap(group -> Stream.of(group.split(":", -1)))
                .toList();

        boolean isShort = ip.contains("::");
        int length = isShort ? groups.size() + 2 : groups.size();

        if ((!isShort && length < 8) || length > 8) {
            return false;
        }

        return groups.stream().allMatch(App::isValidGroup);
    }

    private static boolean isValidGroup(String group) {
        String hex = "0x" + group;
        return NumberUtils.isCreatable(hex) && group.length() <= 4;
    }
}
