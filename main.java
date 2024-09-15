import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherService() {
        teachers = new ArrayList<>();
        nextId = 1; // Автоматическая генерация ID
    }

    public Teacher addTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null; // Учитель не найден
    }

    public boolean editTeacher(int id, String newName, String newSubject) {
        Teacher teacher = getTeacherById(id);
        if (teacher != null) {
            teacher.setName(newName);
            teacher.setSubject(newSubject);
            return true;
        }
        return false; // Учитель с указанным ID не найден
    }
}
