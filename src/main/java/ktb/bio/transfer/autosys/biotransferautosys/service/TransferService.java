package ktb.bio.transfer.autosys.biotransferautosys.service;

import ktb.bio.transfer.autosys.biotransferautosys.entity.TransferEntity;
import ktb.bio.transfer.autosys.biotransferautosys.model.TransferResponse;
import ktb.bio.transfer.autosys.biotransferautosys.repository.TransferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    @Autowired
    private TransferRepo transferRepo;

    public List<TransferResponse> serviceGetAll() {
        List<TransferEntity> list = transferRepo.findAll();
        List
    }
}
