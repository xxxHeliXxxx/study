package collections.main;

public class Main {
    public static void main(String[] args) {
        String[] employees = {
                "Nik",
                "Igor",
                "Vasyl",
                "Olga",
                "Max"
        };
        String[] second = new String[employees.length +1];
        for (int i = 0; i < employees.length; i++) {
            second[i] = employees[i];
        }
        second[second.length - 1] = "Ivan";

        for (String name : employees) {
            System.out.println(name);
        }
    }
}
