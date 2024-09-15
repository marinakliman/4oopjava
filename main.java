import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить учителя\n2. Показать всех учителей\n3. Редактировать учителя\n4. Показать учителя по ID\n5. Выйти");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    controller.addTeacher();
                    break;
                case "2":
                    controller.showAllTeachers();
                    break;
                case "3":
                    controller.editTeacher();
                    break;
                case "4":
                    controller.showTeacherById();
                    break;
                case "5":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
    }
}

