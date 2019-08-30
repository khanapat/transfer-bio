package ktb.bio.transfer.autosys.biotransferautosys.repository;

import ktb.bio.transfer.autosys.biotransferautosys.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface TransferRepo extends JpaRepository<TransferEntity, BigInteger> {


}
