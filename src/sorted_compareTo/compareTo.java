package sorted_compareTo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compareTo {

    public static void main(String[] args) {
        compareTo parent = new compareTo();

        List<sortTarget> list = Arrays.asList(
                parent.new sortTarget("a", 1),
                parent.new sortTarget("b", 2),
                parent.new sortTarget("c", 3),
                parent.new sortTarget("d", 4),
                parent.new sortTarget("e", 5));

        System.out.println("Åösort1Åö");
        Collections.sort(list, parent.new sort1());
        for (sortTarget target : list) {
            System.out.println(target.getName());
        }

        System.out.println();

        System.out.println("Åösort2Åö");
        Collections.sort(list, parent.new sort2());
        list.stream().map(sortTarget::getName).forEach(System.out::println);

        System.out.println();

        System.out.println("Åösort3Åö");
        Collections.sort(list, parent.new sort3());
        for (sortTarget target : list) {
            System.out.println(target.getName());
        }

        System.out.println();

        System.out.println("Åösort4Åö");
        Collections.sort(list, parent.new sort4());
        for (sortTarget target : list) {
            System.out.println(target.getName());
        }
    }

    public class sortTarget {

        private String name;
        private int key;

        public sortTarget() {
        }

        public sortTarget(String name, int key) {
            this.name = name;
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
    }

    public class sort1 implements Comparator<sortTarget> {

        @Override
        public int compare(sortTarget o1, sortTarget o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public class sort2 implements Comparator<sortTarget> {

        @Override
        public int compare(sortTarget o1, sortTarget o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }

    public class sort3 implements Comparator<sortTarget> {

        @Override
        public int compare(sortTarget o1, sortTarget o2) {
            return o1.getKey() - o2.getKey();
        }
    }

    public class sort4 implements Comparator<sortTarget> {

        @Override
        public int compare(sortTarget o1, sortTarget o2) {
            return o2.getKey() - o1.getKey();
        }
    }
}
