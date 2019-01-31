package lankydan.tutorial.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
//@Getter
//@Setter
//@ToString(exclude = "id")
//@NoArgsConstructor
public class OrderTransaction {

	@Id
	private String id;
	private String from;
	private String to;
	private Long amount;
	private Date date;

	public OrderTransaction() {
		this.date = new Date();
	}

	public OrderTransaction(final String from, final String to, final Long amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.date = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrderTransaction [id=" + id + ", from=" + from + ", to=" + to + ", amount=" + amount + ", date="+date.toString()+"]";
	}
	

}
