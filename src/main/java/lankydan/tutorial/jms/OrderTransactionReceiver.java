package lankydan.tutorial.jms;

/**
 * this bean consumes messages from ActiveMQ and save on Mongo
 */
import lankydan.tutorial.documents.OrderTransaction;
import lankydan.tutorial.repositories.OrderTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class OrderTransactionReceiver {

  @Autowired private OrderTransactionRepository transactionRepository;

  private int count = 1;

  @JmsListener(destination = "OrderTransactionQueue", containerFactory = "myFactory")
  public void receiveMessage(OrderTransaction transaction) {
    System.out.println("<" + count + "> Received <" + transaction.toString() + ">");
    count++;
    //    throw new RuntimeException();
    transactionRepository.save(transaction);
  }
}
