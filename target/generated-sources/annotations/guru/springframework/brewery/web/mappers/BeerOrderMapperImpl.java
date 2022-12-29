package guru.springframework.brewery.web.mappers;

import guru.springframework.brewery.domain.BeerOrder;
import guru.springframework.brewery.domain.BeerOrderLine;
import guru.springframework.brewery.web.model.BeerOrderDto;
import guru.springframework.brewery.web.model.BeerOrderLineDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-29T17:17:01+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class BeerOrderMapperImpl implements BeerOrderMapper {

    @Override
    public BeerOrderDto beerOrderToDto(BeerOrder beerOrder) {
        if ( beerOrder == null ) {
            return null;
        }

        BeerOrderDto beerOrderDto = new BeerOrderDto();

        return beerOrderDto;
    }

    @Override
    public BeerOrder dtoToBeerOrder(BeerOrderDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerOrder beerOrder = new BeerOrder();

        return beerOrder;
    }

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        if ( line == null ) {
            return null;
        }

        BeerOrderLineDto beerOrderLineDto = new BeerOrderLineDto();

        return beerOrderLineDto;
    }
}
