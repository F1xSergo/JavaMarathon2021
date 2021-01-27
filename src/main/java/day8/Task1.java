package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20_000;i++) {
            string = string + i + " "; // почему + выделяет желтым
            //string = String.format("%s%d ", string, i);
        }
        System.out.println(string);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms");

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20_000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2 + " ms");


    }
}
