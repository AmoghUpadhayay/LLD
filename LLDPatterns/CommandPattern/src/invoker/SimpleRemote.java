package invoker;

import Command.Command;

public class SimpleRemote {
     private Command command;

     public SimpleRemote(Command command){
         this.command = command;
     }

     public void buttonPress(){
         command.execute();
     }
}
