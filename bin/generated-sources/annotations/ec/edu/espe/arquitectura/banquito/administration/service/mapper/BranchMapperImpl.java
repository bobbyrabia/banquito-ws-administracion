package ec.edu.espe.arquitectura.banquito.administration.service.mapper;

import ec.edu.espe.arquitectura.banquito.administration.dto.req.BranchReq;
import ec.edu.espe.arquitectura.banquito.administration.dto.res.BranchRes;
import ec.edu.espe.arquitectura.banquito.administration.model.Branch;
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
public class BranchMapperImpl implements BranchMapper {

    @Override
    public Branch toBranch(BranchReq branchReq) {
        if ( branchReq == null ) {
            return null;
        }

        Branch.BranchBuilder branch = Branch.builder();

        branch.bankEntityId( branchReq.getBankEntityId() );
        branch.code( branchReq.getCode() );
        branch.emailAddress( branchReq.getEmailAddress() );
        branch.latitude( branchReq.getLatitude() );
        branch.line1( branchReq.getLine1() );
        branch.line2( branchReq.getLine2() );
        branch.locationId( branchReq.getLocationId() );
        branch.longitude( branchReq.getLongitude() );
        branch.name( branchReq.getName() );
        branch.phoneNumber( branchReq.getPhoneNumber() );
        branch.state( branchReq.getState() );

        return branch.build();
    }

    @Override
    public BranchRes toBranchRes(Branch branch) {
        if ( branch == null ) {
            return null;
        }

        BranchRes.BranchResBuilder branchRes = BranchRes.builder();

        branchRes.code( branch.getCode() );
        branchRes.emailAddress( branch.getEmailAddress() );
        branchRes.latitude( branch.getLatitude() );
        branchRes.line1( branch.getLine1() );
        branchRes.line2( branch.getLine2() );
        branchRes.locationId( branch.getLocationId() );
        branchRes.longitude( branch.getLongitude() );
        branchRes.name( branch.getName() );
        branchRes.phoneNumber( branch.getPhoneNumber() );

        return branchRes.build();
    }

    @Override
    public List<BranchRes> toBranchRes(List<Branch> branches) {
        if ( branches == null ) {
            return null;
        }

        List<BranchRes> list = new ArrayList<BranchRes>( branches.size() );
        for ( Branch branch : branches ) {
            list.add( toBranchRes( branch ) );
        }

        return list;
    }

    @Override
    public void updateBranch(BranchReq branchReq, Branch branch) {
        if ( branchReq == null ) {
            return;
        }

        if ( branchReq.getBankEntityId() != null ) {
            branch.setBankEntityId( branchReq.getBankEntityId() );
        }
        if ( branchReq.getCode() != null ) {
            branch.setCode( branchReq.getCode() );
        }
        if ( branchReq.getEmailAddress() != null ) {
            branch.setEmailAddress( branchReq.getEmailAddress() );
        }
        if ( branchReq.getLatitude() != null ) {
            branch.setLatitude( branchReq.getLatitude() );
        }
        if ( branchReq.getLine1() != null ) {
            branch.setLine1( branchReq.getLine1() );
        }
        if ( branchReq.getLine2() != null ) {
            branch.setLine2( branchReq.getLine2() );
        }
        if ( branchReq.getLocationId() != null ) {
            branch.setLocationId( branchReq.getLocationId() );
        }
        if ( branchReq.getLongitude() != null ) {
            branch.setLongitude( branchReq.getLongitude() );
        }
        if ( branchReq.getName() != null ) {
            branch.setName( branchReq.getName() );
        }
        if ( branchReq.getPhoneNumber() != null ) {
            branch.setPhoneNumber( branchReq.getPhoneNumber() );
        }
        if ( branchReq.getState() != null ) {
            branch.setState( branchReq.getState() );
        }
    }
}
