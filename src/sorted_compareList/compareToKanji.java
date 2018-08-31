package sorted_compareList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compareToKanji {

    public static void main(String[] args) {
        compareToKanji parent = new compareToKanji();

        System.out.println("��sort1�E�E�EcompareTo���\�b�h�ɂ����ёւ���");
        List<ComparaTarget> list1 = setUpList();
        System.out.println("��sort1���ёւ��O��");
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("��sort1���ёւ��ず");
        Collections.sort(list1, parent.new sort1());
        list1.forEach(data -> System.out.println(data.getKeywordKanji()));

        System.out.println("");
        System.out.println("��sort2�E�E�Eswitch����ɂ��C�ӂ̏��ŕ��ёւ��E���̂P��");
        List<ComparaTarget> list2 = setUpList();
        System.out.println("��sort2���ёւ��O��");
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("��sort2���ёւ��ず");
        Collections.sort(list2, parent.new sort2());
        list2.forEach(data -> System.out.println(data.getKeywordKanji()));
        
        System.out.println("");
        System.out.println("��sort3�E�E�Eswitch����ɂ��C�ӂ̏��ŕ��ёւ��E���̂Q��");
        List<ComparaTarget> list3 = setUpList();
        System.out.println("��sort3���ёւ��O��");
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));
        System.out.println("��sort3���ёւ��ず");
        Collections.sort(list3, parent.new sort3());
        list3.forEach(data -> System.out.println(data.getKeywordKanji()));

    }

    /**
     * ���R�����i�����j�ɂ����ёւ�
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
     * �C�ӂ̏����ɂ����ёւ�
     * @author ito-u-oti
     *
     */
    public class sort2 implements Comparator<ComparaTarget> {

        @Override
        public int compare(ComparaTarget o1, ComparaTarget o2) {

            switch (o1.getKeywordKanji()) {
            case "����":
                switch (o2.getKeywordKanji()) {
                case "����":
                    return 0;
                case "�p��":
                    return -1;
                case "���w":
                    return -2;
                case "����":
                    return -3;
                case "���j":
                    return 1;
                default:
                    break;
                }
                break;
            case "�p��":
                switch (o2.getKeywordKanji()) {
                case "����":
                    return 1;
                case "�p��":
                    return 0;
                case "���w":
                    return -1;
                case "����":
                    return -2;
                case "���j":
                    return 2;
                default:
                    break;
                }

                break;
            case "���w":
                switch (o2.getKeywordKanji()) {
                case "����":
                    return 2;
                case "�p��":
                    return 1;
                case "���w":
                    return 0;
                case "����":
                    return -1;
                case "���j":
                    return 3;
                default:
                    break;
                }
                break;
            case "����":
                switch (o2.getKeywordKanji()) {
                case "����":
                    return 3;
                case "�p��":
                    return 2;
                case "���w":
                    return 1;
                case "����":
                    return 0;
                case "���j":
                    return 4;
                default:
                    break;
                }

                break;
            case "���j":
                switch (o2.getKeywordKanji()) {
                case "����":
                    return -1;
                case "�p��":
                    return -2;
                case "���w":
                    return -3;
                case "����":
                    return -4;
                case "���j":
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
     * �C�ӂ̏����ɂ����ёւ�
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
            case "����":
                return 2;
            case "�p��":
                return 3;
            case "���w":
                return 4;
            case "����":
                return 5;
            case "���j":
                return 1;
            default:
                return 6;
            }
        }
    }

    private static List<ComparaTarget> setUpList() {

        List<ComparaTarget> list = new ArrayList<ComparaTarget>();
        ComparaTarget a = new ComparaTarget();
        a.setKeywordKanji("�p��");
        list.add(a);
        ComparaTarget b = new ComparaTarget();
        b.setKeywordKanji("����");
        list.add(b);
        ComparaTarget c = new ComparaTarget();
        c.setKeywordKanji("����");
        list.add(c);
        ComparaTarget d = new ComparaTarget();
        d.setKeywordKanji("�p��");
        list.add(d);
        ComparaTarget e = new ComparaTarget();
        e.setKeywordKanji("���j");
        list.add(e);
        ComparaTarget f = new ComparaTarget();
        f.setKeywordKanji("����");
        list.add(f);
        ComparaTarget g = new ComparaTarget();
        g.setKeywordKanji("���w");
        list.add(g);
        ComparaTarget h = new ComparaTarget();
        h.setKeywordKanji("����");
        list.add(h);
        ComparaTarget i = new ComparaTarget();
        i.setKeywordKanji("���j");
        list.add(i);
        ComparaTarget j = new ComparaTarget();
        j.setKeywordKanji("�p��");
        list.add(j);

        return list;

    }
}
