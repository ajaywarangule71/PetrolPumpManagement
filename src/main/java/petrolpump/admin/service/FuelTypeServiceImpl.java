package petrolpump.admin.service;

import java.util.List;

import pertolpump.admin.model.FuelTypeModel;
import petrolpump.admin.repository.FuelRepository;
import petrolpump.admin.repository.FuelRepositoryImpl;

public class FuelTypeServiceImpl implements FuelService{
FuelRepository fuelRepo = new FuelRepositoryImpl();
	@Override
	public boolean isAddFuelModel(FuelTypeModel model) {
		
		return fuelRepo.isAddFuelModel(model);
	}
	public List<FuelTypeModel> getAllFuelTypes() {
		// TODO Auto-generated method stub
		return fuelRepo.getAllFuelTypes();
	}
	@Override
	public boolean isDeleteFuelById(int Typeid) {
		// TODO Auto-generated method stub
		return fuelRepo.isDeleteFuelById(Typeid);
	}
	@Override
	public boolean isUpdateFuel(FuelTypeModel model) {
		// TODO Auto-generated method stub
		return fuelRepo.isUpdateFuel(model);
	}

}
