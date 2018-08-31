package sorted_compareList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compareToKanji {

    public static void main(String[] args) {
        compareToKanji parent = new compareToKanji();

        System.out.println("šsort1EEEcompareToƒƒ\ƒbƒh‚É‚æ‚é•À‚Ñ‘Ö‚¦š");
        List<ComparaTarget> list1 = setUpList();
        System.out.println("šsort1•À‚Ñ‘Ö‚¦‘Oš");
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("šsort1•À‚Ñ‘Ö‚¦Œãš");
        Collections.sort(list1, parent.new sort1());
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));

        System.out.println("");
        System.out.println("šsort2EEEswitch§Œä‚É‚æ‚é”CˆÓ‚Ì‡‚Å•À‚Ñ‘Ö‚¦E‚»‚Ì‚Pš");
        List<ComparaTarget> list2 = setUpList();
        System.out.println("šsort2•À‚Ñ‘Ö‚¦‘Oš");
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("šsort2•À‚Ñ‘Ö‚¦Œãš");
        Collections.sort(list2, parent.new sort2());
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        
        System.out.println("");
        System.out.println("šsort3EEEswitch§Œä‚É‚æ‚é”CˆÓ‚Ì‡‚Å•À‚Ñ‘Ö‚¦E‚»‚Ì‚Qš");
        List<ComparaTarget> list3 = setUpList();
        System.out.println("šsort3•À‚Ñ‘Ö‚¦‘Oš");
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("šsort3•À‚Ñ‘Ö‚¦Œãš");
        Collections.sort(list3, parent.new sort3());
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));

    }

    /**
     * ©‘R‡˜i¸‡j‚É‚æ‚é•À‚Ñ‘Ö‚¦
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
     * ”CˆÓ‚Ì‡˜‚É‚æ‚é•À‚Ñ‘Ö‚¦
     * @author ito-u-oti
     *
     */
    public class sort2 implements Comparator<ComparaTarget> {

        @Override
        public int compare(ComparaTarget o1, ComparaTarget o2) {

            switch (o1.getKeywordKanji()) {
            case "•¨—":
                switch (o2.getKeywordKanji()) {
                case "•¨—":
                    return 0;
                case "‰pŒê":
                    return -1;
                case "”Šw":
                    return -2;
                case "‘Œê":
                    return -3;
                case "—ğj":
                    return 1;
                default:
                    break;
                }
                break;
            case "‰pŒê":
                switch (o2.getKeywordKanji()) {
                case "•¨—":
                    return 1;
                case "‰pŒê":
                    return 0;
                case "”Šw":
                    return -1;
                case "‘Œê":
                    return -2;
                case "—ğj":
                    return 2;
                default:
                    break;
                }

                break;
            case "”Šw":
                switch (o2.getKeywordKanji()) {
                case "•¨—":
                    return 2;
                case "‰pŒê":
                    return 1;
                case "”Šw":
                    return 0;
                case "‘Œê":
                    return -1;
                case "—ğj":
                    return 3;
                default:
                    break;
                }
                break;
            case "‘Œê":
                switch (o2.getKeywordKanji()) {
                case "•¨—":
                    return 3;
                case "‰pŒê":
                    return 2;
                case "”Šw":
                    return 1;
                case "‘Œê":
                    return 0;
                case "—ğj":
                    return 4;
                default:
                    break;
                }

                break;
            case "—ğj":
                switch (o2.getKeywordKanji()) {
                case "•¨—":
                    return -1;
                case "‰pŒê":
                    return -2;
                case "”Šw":
                    return -3;
                case "‘Œê":
                    return -4;
                case "—ğj":
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
     * ”CˆÓ‚Ì‡˜‚É‚æ‚é•À‚Ñ‘Ö‚¦
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
            case "•¨—":
                return 2;
            case "‰pŒê":
                return 3;
            case "”Šw":
                return 4;
            case "‘Œê":
                return 5;
            case "—ğj":
                return 1;
            default:
                return 6;
            }
        }
    }

    private static List<ComparaTarget> setUpList() {

        List<ComparaTarget> list = new ArrayList<ComparaTarget>();
        ComparaTarget a = new ComparaTarget();
        a.setKeywordKanji("‰pŒê");
        list.add(a);
        ComparaTarget b = new ComparaTarget();
        b.setKeywordKanji("•¨—");
        list.add(b);
        ComparaTarget c = new ComparaTarget();
        c.setKeywordKanji("‘Œê");
        list.add(c);
        ComparaTarget d = new ComparaTarget();
        d.setKeywordKanji("‰pŒê");
        list.add(d);
        ComparaTarget e = new ComparaTarget();
        e.setKeywordKanji("—ğj");
        list.add(e);
        ComparaTarget f = new ComparaTarget();
        f.setKeywordKanji("•¨—");
        list.add(f);
        ComparaTarget g = new ComparaTarget();
        g.setKeywordKanji("”Šw");
        list.add(g);
        ComparaTarget h = new ComparaTarget();
        h.setKeywordKanji("‘Œê");
        list.add(h);
        ComparaTarget i = new ComparaTarget();
        i.setKeywordKanji("—ğj");
        list.add(i);
        ComparaTarget j = new ComparaTarget();
        j.setKeywordKanji("‰pŒê");
        list.add(j);

        return list;

    }
}
