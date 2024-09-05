import java.util.*;


public class Task {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static Set<Integer> nums2 = new HashSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static Set<String> strings3 = new HashSet<>(List.of("один", "два","два", "три", "три", "три"));
    static List<String> strings4 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void Task_1() {
        for (Integer i : nums) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void Task_2() {
            for (Integer i : nums2) {
                if ((i % 2 == 0)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
    }

    public static void Task_3() {
        for (String s : strings3) {
            System.out.print(s +" ");
        }
        System.out.println();
    }

    public static void Task_4() {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings4) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for(String key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }
}