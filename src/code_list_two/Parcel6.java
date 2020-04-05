package code_list_two;

//这是一个局部内部类
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                public String getId() {
                    return id;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("Hds");
            System.out.println(trackingSlip.getId());
        }
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.internalTracking(true);
    }

}
