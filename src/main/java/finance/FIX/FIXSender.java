package finance.FIX;
import quickfix.*;

public class FIXSender implements Application {

    @Override
    public void fromAdmin(Message arg0, SessionID arg1) throws FieldNotFound, IncorrectDataFormat,
            IncorrectTagValue, RejectLogon {
    }

    @Override
    public void fromApp(Message arg0, SessionID arg1) throws FieldNotFound, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType { }

    @Override
    public void onCreate(SessionID arg0) {}

    @Override
    public void onLogon(SessionID arg0) {}

    @Override
    public void onLogout(SessionID arg0) {}

    @Override
    public void toAdmin(Message arg0, SessionID arg1) {}

    @Override
    public void toApp(Message msg, SessionID sessionId) throws DoNotSend {
        System.out.println("Sender toApp: " + msg.toString());
    }
}