package ohtu;

public class Submission {

    private String student_number;
    private String week;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
    private String a15, a16, a17, a18, a19, a20, a21;
    private int hours;
    private int tasksDone;
    private int tasksNotDone;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String get_week() {
        return week;

    }

    public int get_hours() {
        try {
            return hours;
        } catch (Exception e) {
            return 0;
        }

    }

    public String getTasks() {
        tasksDone = 0;
        tasksNotDone = 0;
        String[] tehtavat = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21};
        String vastaus = "";
        for (int i = 0; i < tehtavat.length; i++) {
            if (tehtavat[i] == null) {
                continue;
            }
            if (tehtavat[i].matches("true")) {
                vastaus = vastaus + " " + Integer.toString(i + 1);
                tasksDone++;
            } else if (tehtavat[i].matches("false")) {
                tasksNotDone++;
            }
        }
        return vastaus;
    }

    public int getTasksDone() {
        if (tasksDone == 0) {
            getTasks();
        }
        return tasksDone;
    }

    public int getTotalTasks() {
        return tasksDone + tasksNotDone;
    }

    @Override
    public String toString() {
        return student_number;
    }

}
