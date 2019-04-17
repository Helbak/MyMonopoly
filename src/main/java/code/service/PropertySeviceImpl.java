package code.service;

import code.dao.PropertyRepository;
import code.domain.Gamer;
import code.domain.Property;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PropertySeviceImpl implements PropertyService{
    private PropertyRepository propertyRepository;
    @Override
    @Transactional
   public void addProperty (Property property){
       propertyRepository.save(property);
   }
    @Override
    @Transactional
    public List<Property> findProperties(){
       return propertyRepository.findAll();
    }
    @Override
    @Transactional
   public Property getPropertyById(Long id){
      List<Property> properties = findProperties();
        for (Property property:properties){
            if (id==property.getId())
                return property;
        }
        return null;
   }
    @Override
    @Transactional
    public void setGamer (Property property, Gamer gamer){
        property.setGamer(gamer);
    }
}
