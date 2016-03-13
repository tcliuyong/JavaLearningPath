package command;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        ICommand command = new Teacher(student);
        Invoke invoke = new Invoke(command);
        invoke.execute();
    }
}
