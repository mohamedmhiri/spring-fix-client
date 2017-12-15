package finance.FIX;

import quickfix.*;

import java.util.Scanner;

public class ReceiverApp {
    public static void main(String[] args) throws ConfigError {

        SessionSettings settings = new SessionSettings("receiver.cfg");
        Application myApp = new FIXReceiver();
        FileStoreFactory fileStoreFactory = new FileStoreFactory(settings);
        ScreenLogFactory screenLogFactory = new ScreenLogFactory(settings);
        DefaultMessageFactory msgFactory = new DefaultMessageFactory();
        SocketAcceptor acceptor = new SocketAcceptor(myApp, fileStoreFactory,
                settings, screenLogFactory, msgFactory);

        acceptor.start();

        Scanner reader = new Scanner(System.in);
        System.out.println("press <enter> to quit");

        //get user input for a
        reader.nextLine();

        acceptor.stop();
    }

}