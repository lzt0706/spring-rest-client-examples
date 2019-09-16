package lzt.springframework.restclient.pojo;

import java.io.Serializable;

public class Billing implements Serializable {
    private final static long serialVersionUID = 6577338081290507077L;
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
