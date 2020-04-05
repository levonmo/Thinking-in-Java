package code_list_two;

public class Parcel {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Parcel.Contents c = p.new Contents();
        System.out.println(c.value());
        Parcel.Destination d = p.new Destination("H");
        System.out.println(d.readLabel());
    }
}
