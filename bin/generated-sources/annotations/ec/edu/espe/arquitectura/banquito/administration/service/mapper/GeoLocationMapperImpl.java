package ec.edu.espe.arquitectura.banquito.administration.service.mapper;

import ec.edu.espe.arquitectura.banquito.administration.dto.req.GeoLocationReq;
import ec.edu.espe.arquitectura.banquito.administration.dto.res.GeoLocationRes;
import ec.edu.espe.arquitectura.banquito.administration.model.GeoLocation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T18:24:42-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class GeoLocationMapperImpl implements GeoLocationMapper {

    @Override
    public GeoLocation toGeoLocation(GeoLocationReq geoLocationReq) {
        if ( geoLocationReq == null ) {
            return null;
        }

        GeoLocation.GeoLocationBuilder geoLocation = GeoLocation.builder();

        geoLocation.areaPhoneCode( geoLocationReq.getAreaPhoneCode() );
        geoLocation.countryCode( geoLocationReq.getCountryCode() );
        geoLocation.levelCode( geoLocationReq.getLevelCode() );
        geoLocation.levelName( geoLocationReq.getLevelName() );
        geoLocation.levelParentId( geoLocationReq.getLevelParentId() );
        geoLocation.levelParentName( geoLocationReq.getLevelParentName() );
        geoLocation.name( geoLocationReq.getName() );
        geoLocation.zipCode( geoLocationReq.getZipCode() );

        return geoLocation.build();
    }

    @Override
    public GeoLocationRes toGeoLocationRes(GeoLocation geoLocation) {
        if ( geoLocation == null ) {
            return null;
        }

        GeoLocationRes.GeoLocationResBuilder geoLocationRes = GeoLocationRes.builder();

        geoLocationRes.areaPhoneCode( geoLocation.getAreaPhoneCode() );
        geoLocationRes.countryCode( geoLocation.getCountryCode() );
        geoLocationRes.levelName( geoLocation.getLevelName() );
        geoLocationRes.levelParentName( geoLocation.getLevelParentName() );
        geoLocationRes.name( geoLocation.getName() );
        geoLocationRes.uuid( geoLocation.getUuid() );
        geoLocationRes.zipCode( geoLocation.getZipCode() );

        return geoLocationRes.build();
    }

    @Override
    public List<GeoLocationRes> toGeoLocationResList(List<GeoLocation> geoLocations) {
        if ( geoLocations == null ) {
            return null;
        }

        List<GeoLocationRes> list = new ArrayList<GeoLocationRes>( geoLocations.size() );
        for ( GeoLocation geoLocation : geoLocations ) {
            list.add( toGeoLocationRes( geoLocation ) );
        }

        return list;
    }

    @Override
    public void updateGeoLocation(GeoLocationReq geoLocationReq, GeoLocation geoLocation) {
        if ( geoLocationReq == null ) {
            return;
        }

        if ( geoLocationReq.getAreaPhoneCode() != null ) {
            geoLocation.setAreaPhoneCode( geoLocationReq.getAreaPhoneCode() );
        }
        if ( geoLocationReq.getCountryCode() != null ) {
            geoLocation.setCountryCode( geoLocationReq.getCountryCode() );
        }
        if ( geoLocationReq.getLevelCode() != null ) {
            geoLocation.setLevelCode( geoLocationReq.getLevelCode() );
        }
        if ( geoLocationReq.getLevelName() != null ) {
            geoLocation.setLevelName( geoLocationReq.getLevelName() );
        }
        if ( geoLocationReq.getLevelParentId() != null ) {
            geoLocation.setLevelParentId( geoLocationReq.getLevelParentId() );
        }
        if ( geoLocationReq.getLevelParentName() != null ) {
            geoLocation.setLevelParentName( geoLocationReq.getLevelParentName() );
        }
        if ( geoLocationReq.getName() != null ) {
            geoLocation.setName( geoLocationReq.getName() );
        }
        if ( geoLocationReq.getZipCode() != null ) {
            geoLocation.setZipCode( geoLocationReq.getZipCode() );
        }
    }
}
