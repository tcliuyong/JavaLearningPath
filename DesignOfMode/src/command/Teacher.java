package command;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Teacher implements ICommand {

    private Student receiver = null;
    public Teacher(Student receiver){
        this.receiver = receiver;
    }
    public void sweep() {
        receiver.sweeping();
    }
}
