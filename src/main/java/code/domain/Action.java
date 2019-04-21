package code.domain;

import javax.persistence.*;

@Entity
@Table(name = "Action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "step_id")
    private Step step;
    private String action1;
    private String action2;
    private String action3;
    private String action4;
    private String action5;
    private String action6;
    private String action7;
    private String action8;
    private String action9;
    private String action10;

    public Action(Step step, String action1) {
        this.step = step;
        this.action1 = action1;
    }

    public Action() {

    }

    public Action(Step step, String action1, String action2, String action3, String action4, String action5, String action6, String action7, String action8, String action9, String action10) {
        this.step = step;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.action4 = action4;
        this.action5 = action5;
        this.action6 = action6;
        this.action7 = action7;
        this.action8 = action8;
        this.action9 = action9;
        this.action10 = action10;
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

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getAction4() {
        return action4;
    }

    public void setAction4(String action4) {
        this.action4 = action4;
    }

    public String getAction5() {
        return action5;
    }

    public void setAction5(String action5) {
        this.action5 = action5;
    }

    public String getAction6() {
        return action6;
    }

    public void setAction6(String action6) {
        this.action6 = action6;
    }

    public String getAction7() {
        return action7;
    }

    public void setAction7(String action7) {
        this.action7 = action7;
    }

    public String getAction8() {
        return action8;
    }

    public void setAction8(String action8) {
        this.action8 = action8;
    }

    public String getAction9() {
        return action9;
    }

    public void setAction9(String action9) {
        this.action9 = action9;
    }

    public String getAction10() {
        return action10;
    }

    public void setAction10(String action10) {
        this.action10 = action10;
    }
}
