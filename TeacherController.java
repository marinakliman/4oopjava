public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    public void addTeacher() {
        String[] teacherData = teacherView.getTeacherData();
        Teacher teacher = teacherService.addTeacher(teacherData[0], teacherData[1]);
        System.out.println("Учитель " + teacher.getName() + " успешно добавлен.");
    }

    public void showAllTeachers() {
        teacherView.displayTeachers(teacherService.getAllTeachers());
    }

    public void editTeacher() {
        int id = teacherView.getTeacherId();
        Teacher teacher = teacherService.getTeacherById(id);
        if (teacher != null) {
            String[] teacherData = teacherView.getTeacherData();
            if (teacherService.editTeacher(id, teacherData[0], teacherData[1])) {
                System.out.println("Учитель с ID " + id + " успешно обновлен.");
            } else {
                System.out.println("Не удалось обновить учителя с ID " + id + ".");
            }
        } else {
            System.out.println("Учитель с ID " + id + " не найден.");
        }
    }

    public void showTeacherById() {
        int id = teacherView.getTeacherId();
        Teacher teacher = teacherService.getTeacherById(id);
        teacherView.displayTeacher(teacher);
    }
}

