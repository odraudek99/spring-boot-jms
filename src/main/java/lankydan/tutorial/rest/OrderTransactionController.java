package lankydan.tutorial.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lankydan.tutorial.documents.OrderTransaction;

@RestController
@RequestMapping("/transaction")
public class OrderTransactionController {

  @Autowired private JmsTemplate jmsTemplate;

  @PostMapping("/send")
  public String send(@RequestBody OrderTransaction transaction) {
    System.out.println("Sending a transaction.");
    // save message on ActiveMQ
    jmsTemplate.convertAndSend(
        "OrderTransactionQueue", transaction);
    return "Done";
  }
  
 
}
