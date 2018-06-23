package insurwave.blockwavebrokerAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deduction;
import insurwave.blockwavebrokerAPI.repository.SubsectionPremiumDeductionRepository;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductionService;

@Service
public class SubsectionPremiumDeductionServiceImpl implements SubsectionPremiumDeductionService {
	private SubsectionPremiumDeductionRepository subsectionPremiumDeductionRepository;

	@Autowired
	public SubsectionPremiumDeductionServiceImpl(
			SubsectionPremiumDeductionRepository subsectionPremiumDeductionRepository) {
		this.subsectionPremiumDeductionRepository = subsectionPremiumDeductionRepository;
	}

	@Override
	public Subsection_Premium_Deduction saveSubsection_Premium_Deduction(
			Subsection_Premium_Deduction subsection_Premium_Deduction) {
		return subsectionPremiumDeductionRepository.save(subsection_Premium_Deduction);

	}

}
