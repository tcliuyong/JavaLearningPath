package command;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Invoke {
    ICommand command;
    public Invoke(ICommand command){
        this.command = command;
    }
    public void execute(){
        command.sweep();
    }
}
