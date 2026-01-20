package module19.CollectionFramework.List;

import java.util.*;

public class OnlineOrderProcessingSystem {

    public static void main(String[] args) {

        List<Booking> orders = new ArrayList<>();

        orders.add(new Booking(101, "Ravi", 5000, 3, 1700000001000L));
        orders.add(new Booking(102, "Anil", 7000, 2, 1700000000500L));
        orders.add(new Booking(103, "Ravi", 7000, 4, 1700000000200L));
        orders.add(new Booking(104, "Suresh", 7000, 2, 1700000000500L));
        orders.add(new Booking(105, "Anil", 7000, 2, 1700000000500L));

        Collections.sort(orders, new OrderComparator());

        for (Booking b : orders) {
            System.out.println(b);
        }
    }
}

class Booking {
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    Booking(int orderId, String customerName, double orderAmount, int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    public String toString() {
        return orderId + " " + customerName + " " + orderAmount + " " + itemCount + " " + orderTime;
    }
}

class OrderComparator implements Comparator<Booking> {

    public int compare(Booking b1, Booking b2) {

        int amountCompare = Double.compare(b2.orderAmount, b1.orderAmount);
        if (amountCompare != 0) return amountCompare;

        int itemCompare = Integer.compare(b1.itemCount, b2.itemCount);
        if (itemCompare != 0) return itemCompare;

        int timeCompare = Long.compare(b1.orderTime, b2.orderTime);
        if (timeCompare != 0) return timeCompare;

        int nameCompare = b1.customerName.compareTo(b2.customerName);
        if (nameCompare != 0) return nameCompare;

        return Integer.compare(b1.orderId, b2.orderId);
    }
}
