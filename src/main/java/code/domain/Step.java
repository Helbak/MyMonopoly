package code.domain;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "Step")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
private int position;
    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    private List<Property> properties= new ArrayList<Property>();
    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    private List<Gamer> gamers= new ArrayList<Gamer>();

    public Step() {
    }

    public Step(int position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Gamer> getGamers() {
        return gamers;
    }

    public void setGamers(List<Gamer> gamers) {
        this.gamers = gamers;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
