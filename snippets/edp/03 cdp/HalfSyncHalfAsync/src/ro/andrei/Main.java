package ro.andrei;

import ro.andrei.domain.AsyncTask;
import ro.andrei.domain.Dispatcher;
import ro.andrei.domain.Responder;
import ro.andrei.domain.SyncTask;

public class Main {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.doTask(new SyncTask(null, "testsync"));
        Responder responder = new Responder();
        dispatcher.doTask(new AsyncTask(responder, "testasync"));
    }
}
