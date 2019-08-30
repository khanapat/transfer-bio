package ktb.bio.transfer.autosys.biotransferautosys;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

@Slf4j
@SpringBootApplication
public class BioTransferAutosysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BioTransferAutosysApplication.class, args);
	}

	@Autowired
	private EntityManager entityManager;

	@Override
	public void run(String... args) {
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("STC_EXTRACT_IMAGE_test");
		query.registerStoredProcedureParameter("@DIR", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("@AMOUNTTXN", Integer.class, ParameterMode.IN);
		query.setParameter("@DIR", "sf");
		query.setParameter("@AMOUNTTXN", 20);
		log.info(query.getSingleResult().toString());
	}
}
