/**
 * Remote Loader class is the Client in the pattern diagram
 */
public class RemoteLoader {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        ControlledClassOne cc1 = new ControlledClassOne("CC1");
        ControlledClassTwo cc2 = new ControlledClassTwo("CC2");
    
        // Setting the commandsd (it has only two slots for commands)
        remoteControl.setCommand(0, cc1::on, cc1::off);
        remoteControl.setCommand(1, cc2::setOnState, cc2::setOffState);
    
        // Performing the Remote Control actions
        remoteControl.pressOn(0);
        remoteControl.pressOn(1);
        remoteControl.pressOff(0);
        remoteControl.pressOff(1);
    }
}