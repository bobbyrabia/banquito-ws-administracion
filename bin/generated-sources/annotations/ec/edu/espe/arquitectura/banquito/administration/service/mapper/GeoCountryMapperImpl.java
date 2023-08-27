package ec.edu.espe.arquitectura.banquito.administration.service.mapper;

import ec.edu.espe.arquitectura.banquito.administration.dto.req.GeoCountryReq;
import ec.edu.espe.arquitectura.banquito.administration.dto.req.GeoStructureReq;
import ec.edu.espe.arquitectura.banquito.administration.dto.res.GeoCountryRes;
import ec.edu.espe.arquitectura.banquito.administration.dto.res.GeoStructureRes;
import ec.edu.espe.arquitectura.banquito.administration.model.GeoCountry;
import ec.edu.espe.arquitectura.banquito.administration.model.GeoStructure;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T18:24:41-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class GeoCountryMapperImpl implements GeoCountryMapper {

    @Override
    public GeoCountry toGeoCountry(GeoCountryReq geoCountryReq) {
        if ( geoCountryReq == null ) {
            return null;
        }

        GeoCountry.GeoCountryBuilder geoCountry = GeoCountry.builder();

        geoCountry.countryCode( geoCountryReq.getCountryCode() );
        geoCountry.geoStructures( geoStructureReqListToGeoStructureList( geoCountryReq.getGeoStructures() ) );
        geoCountry.name( geoCountryReq.getName() );
        geoCountry.phoneCode( geoCountryReq.getPhoneCode() );

        return geoCountry.build();
    }

    @Override
    public void updatePais(GeoCountryReq geoCountryReq, GeoCountry geoCountry) {
        if ( geoCountryReq == null ) {
            return;
        }

        if ( geoCountryReq.getCountryCode() != null ) {
            geoCountry.setCountryCode( geoCountryReq.getCountryCode() );
        }
        if ( geoCountry.getGeoStructures() != null ) {
            List<GeoStructure> list = geoStructureReqListToGeoStructureList( geoCountryReq.getGeoStructures() );
            if ( list != null ) {
                geoCountry.getGeoStructures().clear();
                geoCountry.getGeoStructures().addAll( list );
            }
        }
        else {
            List<GeoStructure> list = geoStructureReqListToGeoStructureList( geoCountryReq.getGeoStructures() );
            if ( list != null ) {
                geoCountry.setGeoStructures( list );
            }
        }
        if ( geoCountryReq.getName() != null ) {
            geoCountry.setName( geoCountryReq.getName() );
        }
        if ( geoCountryReq.getPhoneCode() != null ) {
            geoCountry.setPhoneCode( geoCountryReq.getPhoneCode() );
        }
    }

    @Override
    public GeoCountryRes toGeoCountryRes(GeoCountry geoCountry) {
        if ( geoCountry == null ) {
            return null;
        }

        GeoCountryRes.GeoCountryResBuilder geoCountryRes = GeoCountryRes.builder();

        geoCountryRes.countryCode( geoCountry.getCountryCode() );
        geoCountryRes.geoStructures( geoStructureListToGeoStructureResList( geoCountry.getGeoStructures() ) );
        geoCountryRes.name( geoCountry.getName() );
        geoCountryRes.phoneCode( geoCountry.getPhoneCode() );

        return geoCountryRes.build();
    }

    @Override
    public List<GeoCountryRes> toRes(List<GeoCountry> geoCountries) {
        if ( geoCountries == null ) {
            return null;
        }

        List<GeoCountryRes> list = new ArrayList<GeoCountryRes>( geoCountries.size() );
        for ( GeoCountry geoCountry : geoCountries ) {
            list.add( toGeoCountryRes( geoCountry ) );
        }

        return list;
    }

    protected GeoStructure geoStructureReqToGeoStructure(GeoStructureReq geoStructureReq) {
        if ( geoStructureReq == null ) {
            return null;
        }

        GeoStructure.GeoStructureBuilder geoStructure = GeoStructure.builder();

        geoStructure.levelCode( geoStructureReq.getLevelCode() );
        geoStructure.name( geoStructureReq.getName() );

        return geoStructure.build();
    }

    protected List<GeoStructure> geoStructureReqListToGeoStructureList(List<GeoStructureReq> list) {
        if ( list == null ) {
            return null;
        }

        List<GeoStructure> list1 = new ArrayList<GeoStructure>( list.size() );
        for ( GeoStructureReq geoStructureReq : list ) {
            list1.add( geoStructureReqToGeoStructure( geoStructureReq ) );
        }

        return list1;
    }

    protected GeoStructureRes geoStructureToGeoStructureRes(GeoStructure geoStructure) {
        if ( geoStructure == null ) {
            return null;
        }

        GeoStructureRes.GeoStructureResBuilder geoStructureRes = GeoStructureRes.builder();

        geoStructureRes.levelCode( geoStructure.getLevelCode() );
        geoStructureRes.name( geoStructure.getName() );

        return geoStructureRes.build();
    }

    protected List<GeoStructureRes> geoStructureListToGeoStructureResList(List<GeoStructure> list) {
        if ( list == null ) {
            return null;
        }

        List<GeoStructureRes> list1 = new ArrayList<GeoStructureRes>( list.size() );
        for ( GeoStructure geoStructure : list ) {
            list1.add( geoStructureToGeoStructureRes( geoStructure ) );
        }

        return list1;
    }
}
