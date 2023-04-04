package com.project.insureme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

	@Autowired
	public
	PolicyRepository policyRepository;

	public Policy CreatePolicy() {

		Policy policy = generateDummyPolicy();

		return policyRepository.save(policy);

	}

	public Policy updatePolicy() {

		return null;
	}

	public String deletePolicy(int policyId) {

		policyRepository.deleteById(policyId);
		return "Deleted Successfully";
	}

	public Policy searchPolicy() {

		return null;
	}

	public Policy generateDummyPolicy() {
		return new Policy(1, "Vikul", "Individual", 10000, "10-Sep-2021", "10-Sep-2022");
	}

	public Policy registerPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepository.save(policy);
	}

	public Policy getPolicyDetails(int policyId) {
		// TODO Auto-generated method stub
		return policyRepository.findById(policyId).get();
	}
	
	public Policy updatePolicy(Policy pol, int policyId) {
		Policy pc = policyRepository.findById(policyId).get();
		pc.setPolicyHolderName(pol.getPolicyHolderName());
		pc.setPolicyPrice(pol.getPolicyPrice());
		pc.setPolicyType(pol.getPolicyType());
		pc.setPolicyStartDate(pol.getPolicyStartDate());
		pc.setPolicyEndDate(pol.getPolicyEndDate());

		//after updation save in db
		policyRepository.save(pc);

		return pc;
	}

}
//@Service
//public class PolicyService {
//	
//	@Autowired
//	public
//	PolicyRepository policyRepository;
//
//
//	public Policy createPolicy() {
//		Policy policy = new Policy(1,"Health","vaibhav", 25000, "19-01-2024","20-03-2023");
//		return policy;
//	}
//
//	public Policy viewPolicy(int policyId) {
//		return policyRepository.findById(policyId).get();
//	}
//
//	public Policy createPolicy(Policy policy) {
//		// TODO Auto-generated method stub
//		return policyRepository.save(policy);
//	}
//
//	public Policy update(Policy policy) {
//		// TODO Auto-generated method stub
//		return policyRepository.save(policy);
//	}
//
//	public void deletePolicy(int policyId) {
//		
//		policyRepository.deleteById(policyId);
//	}
//
//	public List<Policy> getAllpolicies() {
//		List<Policy> policies = new ArrayList<Policy>();
//	      policyRepository.findAll().forEach(policy -> policies.add(policy));
//	      return policies;
//	}
//
//	public Short searchPolicy() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void registerPolicy(Policy policy) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public Policy getPolicyDetails(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Policy updatePolicy(Policy updatedPolicy, int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}
//
//	



		//return new Policy(1, "Shubham", "Individual" , 10000, "10-Sep-2021", "10-Sep-2022");
	
