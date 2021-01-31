package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);


        businessProcess(picker);
        System.out.println(picker);
//        System.out.println("Количество собранных заказов на складе "
//                + warehouse.getCountPickedOrders() + ", ЗП  сборщика " + picker.getSalary() + "р");
        businessProcess(courier);
        System.out.println(courier);
//        System.out.println("Количество доставленных заказов на складе "
//                + warehouse.getCountDeliveredOrders() + ", ЗП  курьера " + courier.getSalary() + "р");

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}


