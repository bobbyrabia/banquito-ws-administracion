package ec.edu.espe.arquitectura.banquito.administration.service.mapper;

import ec.edu.espe.arquitectura.banquito.administration.dto.res.BankEntityRes;
import ec.edu.espe.arquitectura.banquito.administration.model.BankEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T18:24:41-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class BankEntityMapperImpl implements BankEntityMapper {

    @Override
    public BankEntityRes toBankEntityRes(BankEntity bankEntity) {
        if ( bankEntity == null ) {
            return null;
        }

        BankEntityRes.BankEntityResBuilder bankEntityRes = BankEntityRes.builder();

        bankEntityRes.internationalCode( bankEntity.getInternationalCode() );
        bankEntityRes.name( bankEntity.getName() );

        return bankEntityRes.build();
    }
}
