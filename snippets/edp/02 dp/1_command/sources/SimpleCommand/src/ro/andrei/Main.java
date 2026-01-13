package ro.andrei;

import ro.andrei.domain.*;

public class Main {

    public static void main(String[] args) {
        Receiver web = new WebServer();
        Receiver app = new ApplicationServer();
        Command webDiagnostics = new DiagnosticsCommand(web);
        Command appDiagnostics = new DiagnosticsCommand(app);
        Invoker invoker = new Invoker();
        invoker.setCommand(webDiagnostics);
        invoker.run();
        invoker.setCommand(appDiagnostics);
        invoker.run();
    }
}
