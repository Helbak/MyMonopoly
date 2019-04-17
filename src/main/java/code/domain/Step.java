package code.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Step")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name="Id_card")
    private Card card;
    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    private List<Gamer> gamers= new ArrayList<Gamer>();

    public Step() {
    }

    public Step( Card card) {

        this.card = card;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
