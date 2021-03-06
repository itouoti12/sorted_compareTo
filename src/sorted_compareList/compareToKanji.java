package sorted_compareList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compareToKanji {

    public static void main(String[] args) {
        compareToKanji parent = new compareToKanji();

        System.out.println("★sort1・・・compareToメソッドによる並び替え★");
        List<ComparaTarget> list1 = setUpList();
        System.out.println("★sort1並び替え前★");
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("★sort1並び替え後★");
        Collections.sort(list1, parent.new sort1());
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));

        System.out.println("");
        System.out.println("★sort2・・・switch制御による任意の順で並び替え・その１★");
        List<ComparaTarget> list2 = setUpList();
        System.out.println("★sort2並び替え前★");
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("★sort2並び替え後★");
        Collections.sort(list2, parent.new sort2());
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        
        System.out.println("");
        System.out.println("★sort3・・・switch制御による任意の順で並び替え・その２★");
        List<ComparaTarget> list3 = setUpList();
        System.out.println("★sort3並び替え前★");
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("★sort3並び替え後★");
        Collections.sort(list3, parent.new sort3());
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));

    }

    /**
     * 自然順序（昇順）による並び替え
     * @author ito-u-oti
     *
     */
    public class sort1 implements Comparator<ComparaTarget> {

        @Override
        public int compare(ComparaTarget o1, ComparaTarget o2) {
            return o1.getKeywordKanji().compareTo(o2.getKeywordKanji());
        }
    }

    /**
     * 任意の順序による並び替え
     * @author ito-u-oti
     *
     */
    public class sort2 implements Comparator<ComparaTarget> {

        @Override
        public int compare(ComparaTarget o1, ComparaTarget o2) {

            switch (o1.getKeywordKanji()) {
            case "物理":
                switch (o2.getKeywordKanji()) {
                case "物理":
                    return 0;
                case "英語":
                    return -1;
                case "数学":
                    return -2;
                case "国語":
                    return -3;
                case "歴史":
                    return 1;
                default:
                    break;
                }
                break;
            case "英語":
                switch (o2.getKeywordKanji()) {
                case "物理":
                    return 1;
                case "英語":
                    return 0;
                case "数学":
                    return -1;
                case "国語":
                    return -2;
                case "歴史":
                    return 2;
                default:
                    break;
                }

                break;
            case "数学":
                switch (o2.getKeywordKanji()) {
                case "物理":
                    return 2;
                case "英語":
                    return 1;
                case "数学":
                    return 0;
                case "国語":
                    return -1;
                case "歴史":
                    return 3;
                default:
                    break;
                }
                break;
            case "国語":
                switch (o2.getKeywordKanji()) {
                case "物理":
                    return 3;
                case "英語":
                    return 2;
                case "数学":
                    return 1;
                case "国語":
                    return 0;
                case "歴史":
                    return 4;
                default:
                    break;
                }

                break;
            case "歴史":
                switch (o2.getKeywordKanji()) {
                case "物理":
                    return -1;
                case "英語":
                    return -2;
                case "数学":
                    return -3;
                case "国語":
                    return -4;
                case "歴史":
                    return 0;
                default:
                    break;
                }

                break;

            default:
                break;
            }
            return o1.getKeywordKanji().compareTo(o2.getKeywordKanji());
        }
    }

    /**
     * 任意の順序による並び替え
     * @author ito-u-oti
     *
     */
    public class sort3 implements Comparator<ComparaTarget> {

        @Override
        public int compare(ComparaTarget o1, ComparaTarget o2) {

            int calc = changeKey(o1.getKeywordKanji()) - changeKey(o2.getKeywordKanji());

            return calc;
        }

        private int changeKey(String str) {

            switch (str) {
            case "物理":
                return 2;
            case "英語":
                return 3;
            case "数学":
                return 4;
            case "国語":
                return 5;
            case "歴史":
                return 1;
            default:
                return 6;
            }
        }
    }

    private static List<ComparaTarget> setUpList() {

        List<ComparaTarget> list = new ArrayList<ComparaTarget>();
        ComparaTarget a = new ComparaTarget();
        a.setKeywordKanji("英語");
        list.add(a);
        ComparaTarget b = new ComparaTarget();
        b.setKeywordKanji("物理");
        list.add(b);
        ComparaTarget c = new ComparaTarget();
        c.setKeywordKanji("国語");
        list.add(c);
        ComparaTarget d = new ComparaTarget();
        d.setKeywordKanji("英語");
        list.add(d);
        ComparaTarget e = new ComparaTarget();
        e.setKeywordKanji("歴史");
        list.add(e);
        ComparaTarget f = new ComparaTarget();
        f.setKeywordKanji("物理");
        list.add(f);
        ComparaTarget g = new ComparaTarget();
        g.setKeywordKanji("数学");
        list.add(g);
        ComparaTarget h = new ComparaTarget();
        h.setKeywordKanji("国語");
        list.add(h);
        ComparaTarget i = new ComparaTarget();
        i.setKeywordKanji("歴史");
        list.add(i);
        ComparaTarget j = new ComparaTarget();
        j.setKeywordKanji("英語");
        list.add(j);

        return list;

    }
}
