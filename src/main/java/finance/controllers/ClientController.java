package finance.controllers;


import finance.models.Greeting;
import finance.models.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import quickfix.ConfigError;
import quickfix.SessionNotFound;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/fix")
public class ClientController {

    @RequestMapping(method = RequestMethod.POST, path = "/logon")
    public Greeting getMessage(@RequestBody Greeting input) {
        return new Greeting(1, input.getContent());
    }


    @RequestMapping(value="/new-order", method = RequestMethod.POST, consumes = "application/json")
    public Map<String, String> newOrder(@RequestBody Transaction t) throws InterruptedException, ConfigError, SessionNotFound {
        Map<String,String> result = new HashMap<>();
        result.put("req", t.getReq());
        result.put("dir",t.getDir());
        result.put("type",t.getType());

        System.out.println("Executing requested transaction : ");

        finance.FIX.SenderApp.execute(t.getReq(),t.getDir(),t.getType(),t.getQty(),t.getPrice());




        return result;

    }
}

