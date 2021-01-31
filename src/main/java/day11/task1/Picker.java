package day11.task1;


public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }



    @Override
    public void doWork() {
        salary += 80;
        warehouse.getCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70_000;
        isPayed = true;
    }
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}


