public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();
        System.out.println("Task2");
        System.out.println("Method with do-wheel");
        int totalDistance = 42195;
        int traveledDistance = 0;
        do {
            int remaining = totalDistance - traveledDistance;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            traveledDistance += 500;
        } while (traveledDistance < totalDistance);
        System.out.println();
        System.out.println("Метод с for");
        for (traveledDistance = 0; traveledDistance < totalDistance; traveledDistance += 500) {
            int remaining = totalDistance - traveledDistance;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }

        System.out.println();
        System.out.println("Task3");
        System.out.println("Method with wheel");
        int money = 3450;
        int day = 0;
        while (money > 0) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            money -= 100;
        }
        System.out.println(day);


        System.out.println();
        System.out.println("Method with for");
        money = 3450;
        day = 0;
        for (; money > 0; ) {
            day++;
            if (day % 5 == 0) continue;
            money -= 100;
        }
        System.out.println(day);


        System.out.println();
        System.out.println("Task4");
        int month = 0;    //колличество месяцев
        double total = 0;    //всего денег
        while (true) {
            month = month + 1;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц " + month + " на балансе " + (int) total + " рублей");
            if (total >= 12_000_000) {
                break;
            }
        }
        System.out.println(month);


        System.out.println();
        System.out.println("Task5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100){
            if (overheats == 3){
                System.out.println("Досрочное завершение зарядки, заряд устройства " + charge + "%");
                break;
            }
            minute++;
            if (minute % 10 == 0){
                overheats++;
                minute += 2;
                System.out.println("Телефон перегрелся, колличество перегревов " + overheats);
                continue;
            }else{
                charge +=2;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}