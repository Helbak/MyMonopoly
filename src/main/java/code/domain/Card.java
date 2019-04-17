package code.domain;

import javax.persistence.*;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    @JoinColumn(name="Id_step")
    private Step step;
    @OneToOne
    @JoinColumn(name="Id_property")
    private Property property;

    public Card() {
    }

    public Card(Step step , Property property) {
        this.step = step;
        this.property = property;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
