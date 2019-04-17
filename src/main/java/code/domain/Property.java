package code.domain;

import javax.persistence.*;

@Entity
@Table(name = "Property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    @JoinColumn(name="Id_card")
    private Card card;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gamer_id")
    private Gamer gamer;

    private String city;
    private int cityId;
    private int numberStreetInCity;
    private String street;
    private  int price;
    private  int rentEmpty;
    private int rent1;
    private int rent2;
    private  int rent3;
    private int rent4;
    private  int rentHotel;
    private int priceHome;
    private int priceHotel;
private int numberOfHome;
private boolean isHotel;

    public Property() {
    }

    public Property(Card card, Gamer gamer, String city, int cityId, int numberStreetInCity, String street, int price, int rentEmpty, int rent1, int rent2, int rent3, int rent4, int rentHotel, int priceHome, int priceHotel, int numberOfHome, boolean isHotel) {
       this.card = card;
        this.gamer = gamer;
        this.city = city;
        this.cityId = cityId;
        this.numberStreetInCity = numberStreetInCity;
        this.street = street;
        this.price = price;
        this.rentEmpty = rentEmpty;
        this.rent1 = rent1;
        this.rent2 = rent2;
        this.rent3 = rent3;
        this.rent4 = rent4;
        this.rentHotel = rentHotel;
        this.priceHome = priceHome;
        this.priceHotel = priceHotel;
        this.numberOfHome = numberOfHome;
        this.isHotel = isHotel;
    }

    public Property(Card card, Gamer gamer, String city, int cityId, int numberStreetInCity, String street, int price, int rentEmpty, int rent1, int rent2, int rent3, int rentHotel, int priceHome, int priceHotel, int numberOfHome, boolean isHotel) {
        this.card = card;
        this.gamer = gamer;
        this.city = city;
        this.cityId = cityId;
        this.numberStreetInCity = numberStreetInCity;
        this.street = street;
        this.price = price;
        this.rentEmpty = rentEmpty;
        this.rent1 = rent1;
        this.rent2 = rent2;
        this.rent3 = rent3;
        this.rentHotel = rentHotel;
        this.priceHome = priceHome;
        this.priceHotel = priceHotel;
        this.numberOfHome = numberOfHome;
        this.isHotel = isHotel;
    }

    public Property( Card card, Gamer gamer, String city, int cityId, int numberStreetInCity, String street, int price, int rentEmpty, int rent1, int rent2, int rentHotel, int priceHome, int priceHotel, int numberOfHome, boolean isHotel) {
        this.card = card;
        this.gamer = gamer;
        this.city = city;
        this.cityId = cityId;
        this.numberStreetInCity = numberStreetInCity;
        this.street = street;
        this.price = price;
        this.rentEmpty = rentEmpty;
        this.rent1 = rent1;
        this.rent2 = rent2;
        this.rentHotel = rentHotel;
        this.priceHome = priceHome;
        this.priceHotel = priceHotel;
        this.numberOfHome = numberOfHome;
        this.isHotel = isHotel;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getNumberStreetInCity() {
        return numberStreetInCity;
    }

    public void setNumberStreetInCity(int numberStreetInCity) {
        this.numberStreetInCity = numberStreetInCity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentEmpty() {
        return rentEmpty;
    }

    public void setRentEmpty(int rentEmpty) {
        this.rentEmpty = rentEmpty;
    }

    public int getRent1() {
        return rent1;
    }

    public void setRent1(int rent1) {
        this.rent1 = rent1;
    }

    public int getRent2() {
        return rent2;
    }

    public void setRent2(int rent2) {
        this.rent2 = rent2;
    }

    public int getRent3() {
        return rent3;
    }

    public void setRent3(int rent3) {
        this.rent3 = rent3;
    }

    public int getRent4() {
        return rent4;
    }

    public void setRent4(int rent4) {
        this.rent4 = rent4;
    }

    public int getRentHotel() {
        return rentHotel;
    }

    public void setRentHotel(int rentHotel) {
        this.rentHotel = rentHotel;
    }

    public int getPriceHome() {
        return priceHome;
    }

    public void setPriceHome(int priceHome) {
        this.priceHome = priceHome;
    }

    public int getPriceHotel() {
        return priceHotel;
    }

    public void setPriceHotel(int priceHotel) {
        this.priceHotel = priceHotel;
    }

    public int getNumberOfHome() {
        return numberOfHome;
    }

    public void setNumberOfHome(int numberOfHome) {
        this.numberOfHome = numberOfHome;
    }

    public boolean isHotel() {
        return isHotel;
    }

    public void setHotel(boolean hotel) {
        isHotel = hotel;
    }
}
