//package finance;
//
//import io.allune.quickfixj.spring.boot.starter.EnableQuickFixJClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
////import quickfix.MessageStoreFactory;
//import quickfix.*;
//
//
//@EnableQuickFixJClient
//@SpringBootApplication
//public class AppClient implements CommandLineRunner{
//
//    private static final Logger log = LoggerFactory.getLogger(AppClient.class);
//
//    public static void main(String[] args) throws ConfigError, InterruptedException, SessionNotFound {
//
//        SessionSettings settings = new SessionSettings("sender.cfg");
//        Application myApp = new FIXSender();
//        FileStoreFactory fileStoreFactory = new FileStoreFactory(settings);
//        ScreenLogFactory screenLogFactory = new ScreenLogFactory(settings);
//        DefaultMessageFactory msgFactory = new DefaultMessageFactory();
//        SocketInitiator initiator = new SocketInitiator(myApp, fileStoreFactory, settings,
//                screenLogFactory, msgFactory);
//
//        initiator.start();
//
//        Thread.sleep(3000);
//
//        // matching values from sender.cfg
//        SessionID sessionID = new SessionID("FIX.4.4", "CLIENT1", "FixServer");
//        NewOrderSingle order = new NewOrderSingle(new ClOrdID("DLF"), new Side(Side.BUY),
//                new TransactTime(new Date()), new OrdType(OrdType.MARKET));
//
//        order.set(new OrderQty(1000));
//        order.set(new Price(40));
//        order.set(new Symbol("BHP"));
//        Session.sendToTarget(order, sessionID);
//
//        Thread.sleep(60000);
//
//        initiator.stop();
//    }
//
//    public static void execute(/*String orderID,*/ String dir, String type, String qty, String price, String req)throws ConfigError, InterruptedException, SessionNotFound {
//
//        char sideCode = Side.UNDISCLOSED;
//        char ordertypeCode = OrdType.MARKET;
//
//        if(side == "buy") sideCode = Side.BUY;
//        if(side == "sell") sideCode = Side.SELL;
//
//        if(orderType == "market") ordertypeCode=OrdType.MARKET;
//        if(orderType == "limit") ordertypeCode=OrdType.LIMIT;
//        if(orderType == "stop") ordertypeCode=OrdType.STOP;
//        if(orderType == "stoplimit") ordertypeCode=OrdType.STOP_LIMIT;
//
//
//
//        SessionSettings settings = new SessionSettings("sender.cfg");
//        Application myApp = new FIXSender();
//        FileStoreFactory fileStoreFactory = new FileStoreFactory(settings);
//        ScreenLogFactory screenLogFactory = new ScreenLogFactory(settings);
//        DefaultMessageFactory msgFactory = new DefaultMessageFactory();
//        SocketInitiator initiator = new SocketInitiator(myApp, fileStoreFactory, settings,
//                screenLogFactory, msgFactory);
//
//        initiator.start();
//
//        Thread.sleep(1000);
//
//        // matching values from sender.cfg
//        SessionID sessionID = new SessionID("FIX.4.4", "CLIENT1", "FixServer");
//        NewOrderSingle order = new NewOrderSingle(new ClOrdID(orderID), new Side(sideCode),
//                new TransactTime(new Date()), new OrdType(ordertypeCode));
//
//        order.set(new OrderQty(orderQty));
//        order.set(new Price(price));
//        order.set(new Symbol(symbol));
//        Session.sendToTarget(order, sessionID);
//
//        Thread.sleep(5000);
//
//        initiator.stop();
//    }
//}