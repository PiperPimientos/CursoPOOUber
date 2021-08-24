public class Card extends Payments {

    Integer numberCard;
    String dateCard;
    String cvv;

    public Card(Integer id, Integer numberCard, String dateCard, String cvv) {
        super(id);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
        
    }
    
}
