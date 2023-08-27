package ec.edu.espe.arquitectura.banquito.administration.service.mapper;

import ec.edu.espe.arquitectura.banquito.administration.dto.req.HolidayReq;
import ec.edu.espe.arquitectura.banquito.administration.dto.res.HolidayRes;
import ec.edu.espe.arquitectura.banquito.administration.model.Holiday;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T18:24:38-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class HolidayMapperImpl implements HolidayMapper {

    @Override
    public Holiday toHoliday(HolidayReq holidayReq) {
        if ( holidayReq == null ) {
            return null;
        }

        Holiday.HolidayBuilder holiday = Holiday.builder();

        holiday.countryCode( holidayReq.getCountryCode() );
        holiday.geoLocationId( holidayReq.getGeoLocationId() );
        holiday.holidayDate( holidayReq.getHolidayDate() );
        holiday.name( holidayReq.getName() );
        holiday.type( holidayReq.getType() );

        return holiday.build();
    }

    @Override
    public HolidayReq toHolidayDto(Holiday holiday) {
        if ( holiday == null ) {
            return null;
        }

        HolidayReq.HolidayReqBuilder holidayReq = HolidayReq.builder();

        holidayReq.countryCode( holiday.getCountryCode() );
        holidayReq.geoLocationId( holiday.getGeoLocationId() );
        holidayReq.holidayDate( holiday.getHolidayDate() );
        holidayReq.name( holiday.getName() );
        holidayReq.type( holiday.getType() );

        return holidayReq.build();
    }

    @Override
    public HolidayRes toHolidayRes(Holiday holiday) {
        if ( holiday == null ) {
            return null;
        }

        HolidayRes.HolidayResBuilder holidayRes = HolidayRes.builder();

        holidayRes.countryCode( holiday.getCountryCode() );
        holidayRes.geoLocationId( holiday.getGeoLocationId() );
        holidayRes.holidayDate( holiday.getHolidayDate() );
        holidayRes.name( holiday.getName() );
        holidayRes.type( holiday.getType() );
        holidayRes.uuid( holiday.getUuid() );

        return holidayRes.build();
    }

    @Override
    public List<HolidayRes> toHolidayResList(List<Holiday> holidays) {
        if ( holidays == null ) {
            return null;
        }

        List<HolidayRes> list = new ArrayList<HolidayRes>( holidays.size() );
        for ( Holiday holiday : holidays ) {
            list.add( toHolidayRes( holiday ) );
        }

        return list;
    }

    @Override
    public void updateHoliday(HolidayReq holidayReq, Holiday holiday) {
        if ( holidayReq == null ) {
            return;
        }

        if ( holidayReq.getCountryCode() != null ) {
            holiday.setCountryCode( holidayReq.getCountryCode() );
        }
        if ( holidayReq.getGeoLocationId() != null ) {
            holiday.setGeoLocationId( holidayReq.getGeoLocationId() );
        }
        if ( holidayReq.getHolidayDate() != null ) {
            holiday.setHolidayDate( holidayReq.getHolidayDate() );
        }
        if ( holidayReq.getName() != null ) {
            holiday.setName( holidayReq.getName() );
        }
        if ( holidayReq.getType() != null ) {
            holiday.setType( holidayReq.getType() );
        }
    }
}
