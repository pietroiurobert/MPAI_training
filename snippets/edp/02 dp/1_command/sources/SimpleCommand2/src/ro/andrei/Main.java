package ro.andrei;

import ro.andrei.domain.*;

public class Main {

    public static void main(String[] args) {
        Receiver web = new WebServer();
        Receiver app = new ApplicationServer();
        Command webDiagnostics = new DiagnosticsCommand(web);
        Command appRestart = new RestartCommand(app);
        Command appDiagnostics = new DiagnosticsCommand(app);
        System.out.println("Testing the simple invoker");
        Invoker invoker = new SimpleInvoker();
        invoker.setCommand(webDiagnostics);
        invoker.run();
        invoker.setCommand(appRestart);
        invoker.run();
        invoker.undo();
        System.out.println("Testing the complex invoker");
        invoker = new ComplexInvoker();
        invoker.setCommand(webDiagnostics);
        invoker.setCommand(appDiagnostics);
        invoker.setCommand(appRestart);
        System.out.println("Running one command");
        invoker.run();
        System.out.println("Running all commands");
        ((ComplexInvoker)invoker).runAll();
        System.out.println("Undoing a command");
        invoker.undo();
        invoker.undo();
    }
}