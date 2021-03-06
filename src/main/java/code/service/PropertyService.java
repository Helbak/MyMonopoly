package code.service;

import code.domain.Gamer;
import code.domain.Property;

import java.util.List;

public interface PropertyService {
    void addProperty (Property property);
    List<Property> findProperties();
    Property getPropertyById(Long id);
    void setHotelTrue (Property property);
    void setHotelFalse (Property property);
    void setGamer (Property property, Gamer gamer);
}
