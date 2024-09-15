import java.util.List;
import java.util.Scanner;

public class TeacherView {

    private Scanner scanner;

    public TeacherView() {
        scanner = new Scanner(System.in);
    }

    public void displayTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("Список учителей пуст.");
        } else {
            System.out.println("Список учителей:");
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Учитель не найден.");
        }
    }

    public String[] getTeacherData() {
        System.out.print("Введите имя учителя: ");
        String name = scanner.nextLine();
        System.out.print("Введите предмет: ");
        String subject = scanner.nextLine();
        return new String[]{name, subject};
    }

    public int getTeacherId() {
        System.out.print("Введите ID учителя: ");
        return scanner.nextInt();
    }
}

