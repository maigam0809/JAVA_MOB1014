package lab08;

/**
 *
 * @author luong
 */

    final public class XPoly {

        public void menu() {
            System.out.println("\n+............MENU..............+");
            System.out.println("1.Chá»©c nÄƒng 1");
            System.out.println("2.Chá»©c nÄƒng 2");
            System.out.println("3.Chá»©c nÄƒng 3");
            System.out.println("4.ThoÃ¡t");
        }

        public static double sum(double... x) {
            int s = 0;
            for (double a : x) {
                s += a;
            }
            return s;
        }

        public static double min(double... nums) {
            double m = nums[0];
            for (double item : nums) {
                m = Math.min(m, item);
            }
            return m;
        }

        public static double max(double... nums) {
            double m = nums[0];
            for (double item : nums) {
                m = Math.max(m, item);
            }
            return m;
        }

        public static String toUpperFirstChar(String name) {
            String[] ars = name.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ars.length; i++) {
                String item = ars[i];
                if (!item.equals("")) {
                    String ch = item.substring(0, 1).toUpperCase();
                    item = ch + item.substring(1).toLowerCase();
                    sb.append(item).append(" ");
                }
            }
            return sb.toString().trim();
        }
    }
